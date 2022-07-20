import java.util.Scanner;

public class longWords {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int numberOfWords = scan.nextInt();
		
		if(numberOfWords >= 1 && numberOfWords <= 100){
			for(int i = 0; i <= numberOfWords; i++){
				String firstWord = scan.nextLine();
				
				
				
				if(firstWord.length() > 10){
					int numberOfChars = firstWord.length() - 2;
					
					char fLetter = firstWord.charAt(0);
					char lLetter = firstWord.charAt(firstWord.length() - 1);
					
					System.out.println(fLetter + "" + numberOfChars + "" + lLetter);
				}else if (firstWord.length() > 0){
					System.out.println(firstWord);
				
				}
			}
		}
	}
}