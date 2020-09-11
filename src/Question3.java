
public class Question3 {
	public static void main(String[] args) {
		int arg = Integer.parseInt(args[0]);
		
		int previousNumber = 0;
		int nextNumber = 1;
		 

	    for (int i = 1; i <= arg; ++i)
	        {
	            System.out.print(previousNumber+" ");

	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
		}
		
	}

