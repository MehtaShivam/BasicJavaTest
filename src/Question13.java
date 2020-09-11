import java.util.Scanner;

public class Question13 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter input string to be cleaned from white spaces...!");
		
		String input = keyboard.nextLine();
		String cleanedString = input.replace(" ", "");
		System.out.println(cleanedString);
	}
}
