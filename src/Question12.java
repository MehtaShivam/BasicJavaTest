import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the command keyword to exit a loop in Java?");
		System.out.println("a. quit");
		System.out.println("b. continue");
		System.out.println("c. break");
		System.out.println("d. exit");
		
		boolean b = true;
		
		while(b) {
			System.out.print("Enter your choice: ");
			String answer = keyboard.nextLine();
			
			switch (answer) {
			case "a":
				System.out.println("Incorrect!");
				System.out.println("Again? press y to continue: ");
				String response = keyboard.nextLine();
				if (response == "y") {
					b = false;
					break;
				}
				else {
					continue;
				}
			case "b":
				System.out.println("Incorrect!");
				System.out.println("Again? press y to continue: ");
				String response_two = keyboard.nextLine();
				if (response_two == "y") {
					b = false;
					break;
				}
				else {
					continue;
				}
			case "c":
				System.out.println("Congratulations!");
				System.out.println("Again? press y to continue: ");
				String response_three = keyboard.nextLine();
				if (response_three == "y") {
					b = false;
					break;
				}
				else {
					continue;
				}
			case "d":
				System.out.println("Incorrect!");
				System.out.println("Again? press y to continue: ");
				String response_four = keyboard.nextLine();
				if (response_four == "y") {
					b = false;
					break;
				}
				else {
					continue;
				}
			default:
				break;
			}
			
		}
	}

}
