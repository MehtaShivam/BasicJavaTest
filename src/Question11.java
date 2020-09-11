
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4000; i++) {
			if(i % 400 == 0) {
				continue;
			}else if (i % 100 == 0) {
				System.out.println(i);
			}else if (i % 4 == 0) {
				continue;
			}else {
				System.out.println(i);
			}
		}
	}

}
