import java.util.Scanner;


public class Test {

	public static void main(String[] args) {

		int number = 0;
		int tamamlanmisSayi;
		Scanner input = new Scanner(System.in);
		for(;;){
			try{
				System.out.print("Enter the number: ");
				number = input.nextInt();
			}catch (Exception e) {
				System.out.println("Yanlis bir giriş yaptiniz.");
				main(args);
			}	
			if(number < 2)
				System.out.println("Asal sayılar 2'den küçük olamaz.");
			else
				break;
		}
		tamamlanmisSayi = asalSayiyaTamamla(number);

		if(tamamlanmisSayi == 0){
			System.out.println("Girdiğiniz sayi zaten asal.Lütfen başa dönün.");
			main(args);
		}
		else
			System.out.print("Sayinin donustugu asal sayi : " + tamamlanmisSayi);
		System.exit(-1);
	}

	public static int asalSayiyaTamamla(int number){

		int[] primeNumbers = new int[2*number];
		boolean flag;
		int z = 0;
		int index = 0;
		for (int i = 2 ; i < 2*number; i++) {
			flag = true;
			for (int j = 2; j < i; j++) {
				if(i % j == 0)
					flag = false;
			}

			if(flag == true){
				primeNumbers[z] = i;
				z++;
			}
		}

		for (int y = 0; y < z; y++) {
			if(number == primeNumbers[y])
				return 0;
			if(number < primeNumbers[y] && number > primeNumbers[y-1])
				index = y;
		}

		return primeNumbers[index];
	}

}
