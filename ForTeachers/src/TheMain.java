import java.util.Scanner;

public class TheMain {

	public static void main(String[] args) {
		int[] notlar = new int[20];
		String[] ad = new String[20];
		String[] soyad = new String[20]; 
		int notSayisi = 0, toplam = 0; 
		float ort;
		Scanner sc = new Scanner(System.in);

		try{
			System.out.print("Kaç adet not gireceksiniz? ");
			notSayisi = sc.nextInt();
		}catch (Exception e) {
			System.out.println("Yanlis bir giris yaptiniz. ");
			main(args);
		}

		for(int i=1 ; i<=notSayisi ; i++){
			System.out.println("----- " + i + ". OGRENCI -----");
			System.out.print("Ad: ");
			ad[i] = sc.next();

			System.out.print("Soyad: ");
			soyad[i] = sc.next();
			for(;;){
				try{
					System.out.print("Not: ");
					notlar[i] = sc.nextInt();
				}catch (Exception e) {
					System.out.println("Yanlis bir giris yaptiniz. ");
					main(args);
				}

				if(notlar[i] >= 0 && notlar[i] <=100)
					break;
				else
					System.out.println("Girdiginiz not 0 ile 100 aralığında olmalıdır.");
			}
			toplam += notlar[i];
			System.out.println("------------------------");
		}
		ort = (float) toplam / notSayisi;

		System.out.println("\nSinif ortalamasi == " + ort);
		System.out.println("Ortalamayi geçen ögrenciler ve notlari: ");

		for(int i=1 ; i<=notSayisi ; i++){
			if(notlar[i] >= ort)
				System.out.println(ad[i] + "  " + soyad[i] + "  " + notlar[i]);
		}
	}

}
