import java.util.Random;


public class Operations {

	public static boolean isMultiple(double number1, double number2){
		boolean flag = false;

		if(number1 % number2 == 0 || number2 % number1 == 0)
			flag = true;

		return flag;
	}

	public static double Hypotenuse(double number1, double number2){
		double hypotenuse = -1;

		hypotenuse = Math.sqrt(Math.pow(number1, 2) + Math.pow(number2, 2));		

		return hypotenuse;		
	}

	public static void squareOfAsterisks(int numberOfLenght){

		for (int i = 0; i < numberOfLenght; i++) {
			for (int j = 0; j < numberOfLenght; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int ReversingDigits (int number){
		int result = 0;

		while(number > 0){
			result = result * 10 + (number % 10);
			number = number / 10;
		}

		return result;
	}

	public static boolean CoinState(){
		Random rand = new Random();

		if(rand.nextInt(2) == 0)
			return true;
		else 
			return false;
	}

}
