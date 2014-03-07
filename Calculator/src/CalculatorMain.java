
import java.util.Scanner;

public class CalculatorMain {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number1=0  ,number2=0;
		String islem;
		String x;

		do{
			System.out.print("Enter first number: ");
			try{
				number1 =  scan.nextInt();
			}catch(Exception e){
				System.out.println("You have entered wrong option. ");
				System.exit(-1);
			}
			try{
				System.out.print("Enter second number: ");
				number2 =  scan.nextInt();
			}catch(Exception e){
				System.out.println("You have entered wrong option. ");
				System.exit(-1);
			}
			System.out.print("Enter the desired operation ( + , - , * , / ) :  ");
			islem = scan.next();

			if(islem.equals("+")) 
				System.out.println("Result of the operation: " + (number1 + number2) );
			else if (islem.equals("-"))
				System.out.println("Result of the operation: " + (number1 - number2) );
			else if (islem.equals("*"))
				System.out.println("Result of the operation: " + (number1 * number2) );
			else if (islem.equals("/")){
				if(number2 == 0){
					System.out.println("Denominator can not be 0.");
				}
				else
					System.out.println("Result of the operation: " + (float)number1 / number2 );
			}

			for(;;){
				System.out.print("Do you want to make another transacitons? (y/n) :");
				x = scan.next();
				if(x.equals("y") || x.equals("n"))
					break;
				else
					System.out.println("You have entered a wrong option.");
			}

		}while(x.equals("y"));
		if(x.equals("n"))
			System.out.println("\n\n\t\t\t Good Bye...\n\n");
		System.exit(-1);
	}

}

