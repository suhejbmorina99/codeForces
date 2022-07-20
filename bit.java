import java.util.Scanner;

public class bit {
	public static void main(String []args){
	Scanner scan = new Scanner(System.in);


	int numberOfOperation = scan.nextInt();
	int outputValue = 0;

		if(numberOfOperation >= 1 && numberOfOperation <= 150){
			
			for(int i = 0; i <= numberOfOperation; i++) {
				
				String operation = scan.nextLine();


					if(operation.equals("++X") || operation.equals("X++")){

						outputValue++;
					 	
					} else if( operation.equals("--X") || operation.equals("X--")){

						outputValue--;
					}

			}

				System.out.println(outputValue);	



		}
	}
}