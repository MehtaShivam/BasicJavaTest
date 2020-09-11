
public class Question3 {
	public static void main(String[] args) {
		int arg = Integer.parseInt(args[0]);
		
		while(arg >= 0) {
			if (arg == 0) {
				System.out.println(arg);
				break;
			}else if(arg == 1) {
				System.out.println(arg);
				break;
			}else {
				System.out.println((arg-1)+(arg-2));
				arg--;
			}
		}
		
	}
}
