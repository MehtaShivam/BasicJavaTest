import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many rows do you want to print?");
		
		int input = keyboard.nextInt();
		int spaces = input;
		int number = 1;

		for(int i = 0; i < input; i++) {
			for(int j = spaces; j > 0; j--) {
				System.out.print(" ");
				
			}
			for(int k = 1; k <= number; k++) {
				System.out.print(k);
			}
			number++;
			spaces--;
			System.out.println();
		}
	}

}
