import java.util.Scanner;


public class PalindromicNumbersMain {


	public static void main(String[] args) {

		int basamakSayisi = 0;
		int i;
		int sayi = 0;
		int kontrolEdilmisBasamakSayisi;
		int flag = 1;
		String secim;
		Scanner input = new Scanner(System.in);
		do{	
			try{
		
			System.out.print("Kac basamakli sayi gireceksiniz? ");
			basamakSayisi = input.nextInt();
			}catch (Exception e) {
				System.out.println("Yanlis bir giris yaptiniz.");
				main(args);
			}
			int dizi[];
			dizi = new int[basamakSayisi];
			
			try{
			System.out.print("Sayi giriniz: ");
			sayi = input.nextInt();
			}catch (Exception e) {
				System.out.println("Yanlis bir giris yaptiniz.");
				main(args);
			}
			kontrolEdilmisBasamakSayisi = Cntrl.ctrl(sayi);
			
			if(kontrolEdilmisBasamakSayisi == basamakSayisi){

				for (i = basamakSayisi-1; i >= 0; i--)
				{
					dizi[i] = sayi % 10;
					sayi = sayi / 10;
				}
				for ( i = 0; i < basamakSayisi; i++)
				{
					System.out.println( dizi[i]);
				}

				for (i = 0; i <= basamakSayisi/2; i++)
				{
					if (dizi[i] != dizi[basamakSayisi-i-1])
					{
						flag = 0;
						break;
					}
				}

				if(flag == 0)	
					System.out.println("Girdiginiz sayi palindromik sayi degildir. \n\n");
				else 
					System.out.println("Girdiginiz sayi palindromik bir sayidir.\n");

			}

			else{
				System.out.println("Girdiginiz sayi " + basamakSayisi +" basamakli degil, " + kontrolEdilmisBasamakSayisi + " basamaklidir.");
				main(args);
			}
				
			for(;;){
				System.out.print("Devam etmek istiyor musunuz?(e/h) ");
				secim = input.next();
				if(secim.equalsIgnoreCase("e") || secim.equalsIgnoreCase("h"))
					break;
				else
					System.out.println("Yanlis bir secim yaptiniz.");
			}
		}while(secim.equalsIgnoreCase("e"));

		System.out.println("Gule Gule...");
		System.exit(-1);
	}

}
