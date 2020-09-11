import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int input = keyboard.nextInt();
		
		if ((input < 200) && (input % 2 == 0)) {
			System.out.println("Number is less than 200 and even");
		}else {
			System.out.println("Invalid number");
		}
	}

}
