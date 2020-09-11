import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int input = keyboard.nextInt();
		String s = (input > 100) ? "Greater than 100" : "Less than 100";
		System.out.println(s);
	}
}
