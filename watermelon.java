import java.util.Scanner;

public class watermelon {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);		
		int w;

		w = scan.nextInt();
		
		if(w >= 1 && w <= 100){
			if(w%2==0 && w!=2){
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
	}
}