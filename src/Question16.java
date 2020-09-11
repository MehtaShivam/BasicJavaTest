import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the correct way to declare a variable to store an integer value in Java?");
		System.out.println("a. int 1x=10;");
		System.out.println("b. int x=10;");
		System.out.println("c. float x=10.0f;");
		System.out.println("d. string x=\"10\";");
		
		boolean b = true;
		
		while(b) {
			System.out.print("Enter your choice: ");
			String answer = keyboard.nextLine();
			
			switch (answer) {
			case "a":
				System.out.println("Incorrect!");
				break;
			case "b":
				System.out.println("Correct!");
				break;
			case "c":
				System.out.println("Incorrect!");
				break;
			case "d":
				System.out.println("Incorrect!");
				break;
			default:
				break;
			}
			b = false;
		}
	}

}
