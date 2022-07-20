import java.util.Scanner;

public class boyGirl {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		char charaters [] = input.toCharArray();
		String doneChar = "";
		int temp = 0;
		
		for(int i = 0; i < charaters.length; i++) {
			for(int j = i + 1; j < charaters.length; j++) {
				if(charaters[i] == charaters[j] && !doneChar.contains(charaters[j]+"")) {
					temp++;						
				}
			}
		doneChar += charaters[i];
		}

		
		int totalLetters = charaters.length + temp;
		
		if(totalLetters % 2 == 0){
			System.out.println("CHAT WITH HER!");
		}else {
			System.out.println("IGNORE HIM!");
		}
	}
}