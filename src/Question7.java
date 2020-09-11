import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a county in Virginia:");
		String county = keyboard.nextLine();
		System.out.println("Enter a city:");
		String city = keyboard.nextLine();
		
		switch (county) {
		case "Warren":
			switch (city) {
			case "Front Royal":
				System.out.println(county + " - " + city);
				break;
			default:
				System.out.println("Not a city in this county");
				break;
			}
			break;
		case "Fairfax":
			switch (city) {
			case "Fairfax":
				System.out.println(county + " - " + city);
				break;
			default:
				System.out.println("Not a city in this county");
				break;
			}
			break;
		case "Page":
			switch (city) {
			case "Luray":
				System.out.println(county + " - " + city);
				break;
			default:
				System.out.println("Not a city in this county");
				break;
			}
			break;
		default:
			System.out.println("Not a county in our database");
			break;
		}
	}

}
