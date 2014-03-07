import java.util.Scanner;


public class PrimeNumbersMain {

	public static void main(String[] args) {
		
		int i;
		int limit = 2;
		boolean flag;
		
		Scanner input = new Scanner(System.in);
		
		try{
		System.out.print("Enter limit number: ");
		limit = input.nextInt();
		}catch (Exception e) {
			System.out.println("An incorrect entry !");
			main(args);
		}
		for (i = 2; i <= limit; i++) {
			
			flag = PrimeNumberControl.cntrl(i);
			
			if(flag == true)
				System.out.println(i);
		}
		
	}

}
