import java.util.Scanner;


public class MyDateTest {


	private static final String[] args = null;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate();
		try{
			System.out.print("1. tarihin günü: ");
			date1.setDay(input.nextInt());
			control(date1.getDay());

			System.out.print("1. tarihin ayı: ");
			date1.setMonth(input.nextInt());
			control(date1.getMonth());

			System.out.print("1. tarihin yılı: ");
			date1.setYear(input.nextInt());
			control(date1.getYear());

			System.out.print("\n2. tarihin günü: ");
			date2.setDay(input.nextInt());
			control(date2.getDay());

			System.out.print("2. tarihin ayı: ");
			date2.setMonth(input.nextInt());
			control(date2.getMonth());

			System.out.print("2. tarihin yılı: ");
			date2.setYear(input.nextInt());	
			control(date2.getYear());
			
		}catch (Exception e) {
			System.out.println("You have entered wrong option. \n");
			main(args);			
		}

		System.out.println("\nGirdiğiniz ilk tarih: " + date1.getDate());
		System.out.println("Girdiğiniz ikinci tarih: " + date2.getDate());

		if(date1.isBigger(date2))
			System.out.println("Girdiğiniz ilk tarih daha yakın bir tarihdir. ");
		else
			System.out.println("Girdiğiniz ikinci tarih daha yakın bir tarihdir. ");
		System.exit(-1);
	}

	public static void control(int cntl){
		
		if(cntl == -1)
		{
			System.out.println("You have entered wrong option. \n");
			main(args);			
		}
	}
}
