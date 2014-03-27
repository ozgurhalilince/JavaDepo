import java.util.Scanner;


public class OperationsTest {


	private static String[] args;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		menu();
		int choice = 0;
		try{
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
		}catch (Exception e) {
			System.out.println("You have entered wrong option.");
			main(args);
		}

		for(;;){

			switch (choice) {
			case 1:
				submenuisMultiple();			
				break;
			case 2:
				submenuHypotenuse();
				break;
			case 3:
				submenuSquareOfAsterisks();
				break;
			case 4:
				submenuReversingDigits();
				break;
			case 5: 
				submenuCoinState();
				break;
			case 6:
				System.exit(-1);
			default:
				System.out.println("You have entered wrong option.");
				main(args);
				break;
			}
		}
	}

	public static void menu(){
		System.out.println("----------------------------");
		System.out.println("1- is Multiple");
		System.out.println("2- Hypotenuse");
		System.out.println("3- Square Of Asterisks");
		System.out.println("4- Reversing Digits");
		System.out.println("5- Coin State");
		System.out.println("6- Exit");
		System.out.println("----------------------------");
	}

	public static void submenuisMultiple(){

		double number1 = 0, number2 = 0;
		Scanner input = new Scanner(System.in);

		try{
			System.out.print("Enter first number: ");
			number1 = input.nextDouble();
			System.out.print("Enter second number: ");
			number2 = input.nextDouble();
		}catch (Exception e) {
			System.out.println("You have entered wrong option.");
			main(args);
		}

		if(Operations.isMultiple(number1, number2))
			System.out.println(number1 + " is a multipler of " + number2);
		else
			System.out.println(number1 + " is not a multipler of " + number2);
		main(args);
	}

	public static void submenuHypotenuse(){
		double number1 = 0, number2 = 0;
		Scanner input = new Scanner(System.in);

		try{
			System.out.print("Enter first number: ");
			number1 = input.nextDouble();
			System.out.print("Enter second number: ");
			number2 = input.nextDouble();
		}catch (Exception e) {
			System.out.println("You have entered wrong option.");
			main(args);
		}	

		System.out.println("Hypotenuse of the triangle is :" + Operations.Hypotenuse(number1, number2));
		main(args);
	}
	public static void submenuSquareOfAsterisks(){
		Scanner input = new Scanner(System.in);
		int lenghtOfSquare = 0;

		try{
			System.out.print("Enter lenght of square: ");
			lenghtOfSquare = input.nextInt();	
		}catch (Exception e) {
			System.out.println("You have entered wrong option.");
			main(args);
		}	

		if(lenghtOfSquare <= 0){
			System.out.println("Lenght of square can not be negative");
			main(args);
		}
		Operations.squareOfAsterisks(lenghtOfSquare);
		main(args);
	}

	public static void submenuReversingDigits(){
		Scanner input = new Scanner(System.in);
		int number = 0;

		try{
			System.out.println("Enter the number: ");
			number = input.nextInt();
		}catch (Exception e) {
			System.out.println("You have entered wrong option.");
			main(args);
		}	

		if(number <= 0){
			System.out.println("Number con not be negative. ");
			main(args);
		}

		System.out.println(number +" in reversed order is " + Operations.ReversingDigits(number));
		main(args);
	}

	public static void submenuCoinState(){		
		Scanner input = new Scanner(System.in);
		int choice = 1;
		int i = 0;
		String[] durum = new String[100];
		
		for(;;){
			System.out.println("1. At");
			System.out.println("2. Göster");
			try{
				choice = input.nextInt();
			}catch (Exception e) {
				System.out.println("You have entered wrong option.");
				submenuCoinState();
			}
			
			if(choice == 1){
				if(Operations.CoinState())
					durum[i] = "YAZI";
				else 
					durum[i] = "TURA";
			}
			else if (choice == 2)
				break;
			
			i++;
		}
		
		System.out.println("\nSONUCLAR: ");		
		for (int j = 0; j < i; j++) 
			System.out.println(durum[j]);
		
		main(args);
	}



}
