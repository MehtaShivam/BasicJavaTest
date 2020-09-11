import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("Enter a number: ");
			int input = keyboard.nextInt();
			if(input < 0) {
				break;
			}
			sum += input;
			System.out.println(sum);
		}
	}

}
