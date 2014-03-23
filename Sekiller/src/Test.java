import java.util.Scanner;


public class Test {


	private static String[] args;
	public static void main(String[] args) {

		int secim = 0;
		Scanner input = new Scanner(System.in);	
		Ucgen ucgen = new Ucgen();
		Yamuk yamuk = new Yamuk();
		Kare kare = new Kare();
		Daire daire = new Daire();
		ParalelKenar paralelkenar = new ParalelKenar();
		Dikdortgen dikdortgen = new Dikdortgen();

		for(;;){
			menu1();
			try{
				secim = input.nextInt();
			}catch (Exception e) {
				System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.");
				main(args);
			}

			switch (secim) {
			case 1:
				gir(ucgen,  kare,  daire,  paralelkenar,  yamuk,  dikdortgen);
				break;
			case 2:
				menu2();
				karsilastir(ucgen,  kare,  daire,  paralelkenar,  yamuk,  dikdortgen);
				break;
			case 3:
				System.exit(-1);
			default:
				System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.");
				break;
			}
		}

	}
	public static void control(double ctrl){
		if(ctrl == -1){
			System.out.println("Yanlış bir değer girdiniz. \n");
			main(args);
		}	

	}

	public static void menu1(){

		System.out.println("\n---------------------------------------");
		System.out.println(" 1. Alan için gerekli bilgileri girme");
		System.out.println(" 2. Alan Karşılaştırma");
		System.out.println(" 3. Çıkış");
		System.out.println("---------------------------------------");
	}

	public static void menu2(){

		System.out.println("\n---------------------------------------");
		System.out.println(" 1. Üçgen");
		System.out.println(" 2. Kare ");
		System.out.println(" 3. Daire ");
		System.out.println(" 4. ParalelKenar");
		System.out.println(" 5. Yamuk");
		System.out.println(" 6. Dikdörtgen");
		System.out.println("---------------------------------------");
	}
	public static void gir(Ucgen ucgen, Kare kare, Daire daire, ParalelKenar paralelkenar, Yamuk yamuk, Dikdortgen dikdortgen){
		
		int secim2 = 0;
		
		Scanner input = new Scanner(System.in);
		menu2();
		System.out.print("\nSeçiminizi giriniz: ");
		try{
			secim2 = input.nextInt();
		}catch (Exception e) {
			System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.");
			main(args);
		}
		try{
			switch (secim2) {
			case 1:
				System.out.print("Taban uzunluğu: ");
				ucgen.setTaban(input.nextDouble());
				System.out.print("Yukseklik: ");
				ucgen.setYukseklik(input.nextDouble());
				control(ucgen.getAlan());				
				System.out.println("Alan: " + ucgen.getAlan());					
				break;

			case 2:
				System.out.print("Kenar Uzunluğu: ");
				kare.setKenar(input.nextDouble());
				control(kare.getAlan());	
				System.out.println("Alan: " + kare.getAlan());
				break;

			case 3:
				System.out.print("Yarıçap uzunluğu: ");
				daire.setYaricap(input.nextDouble());
				control(daire.getAlan());
				System.out.println("Alan: " + daire.getAlan());
				break;

			case 4:
				System.out.print("Yükseklik: ");
				paralelkenar.setYukseklik(input.nextDouble());
				System.out.print("Taban Uzunluğu: ");
				paralelkenar.setTaban(input.nextDouble());
				control(paralelkenar.getAlan());
				System.out.println("Alan: " + paralelkenar.getAlan());

				break;

			case 5: 
				System.out.print("Alt Kenar Uzunluğu: ");
				yamuk.setAltTaban(input.nextDouble());
				System.out.print("Ust Kenar Uzunluğu: ");
				yamuk.setUstTaban(input.nextDouble());
				System.out.print("Yükseklik: ");
				yamuk.setYukseklik(input.nextDouble());
				control(yamuk.getAlan());
				System.out.println("Alan: " + yamuk.getAlan());
				break;

			case 6:
				System.out.print(" Kısa kenar: ");
				dikdortgen.setKisaKenar(input.nextDouble());
				System.out.print(" Uzun henar: ");
				dikdortgen.setUzunKenar(input.nextDouble());
				control(dikdortgen.getAlan());
				System.out.println("Alan: " + dikdortgen.getAlan());
				break;

			default:
				System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.\n");
				main(args);
				break;
			}
		}catch (Exception e) {
			System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.\n");
			main(args);
		}

	}
		

	public static void karsilastir(Ucgen ucgen, Kare kare, Daire daire, ParalelKenar paralelkenar, Yamuk yamuk, Dikdortgen dikdortgen){

		Scanner scan = new Scanner(System.in);
		int sec1 = 0, sec2 = 0;
		System.out.println("Karşılaştırmak istediğiniz 2 şeklin numaralarını art arda giriniz");
		try{
			sec1 = scan.nextInt();
			sec2 = scan.nextInt();
		}catch (Exception e) {
			System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.");
			main(args);
		}
		if (sec1 <= 7 && sec1 >=1 && sec2 <= 7 && sec1 >= 1){
			if (sec1 == sec2){
				System.out.println("Girdiğiniz sayılar eşit olamaz. Lütfen başa dönünüz.");
				main(args);
			}

			if(sec1 == 1 && sec2 ==2 || sec1 == 2 && sec2 == 1){
				System.out.println("Üçgenin Alanı: " + ucgen.getAlan());
				System.out.println("Karenin Alanı: " + kare.getAlan());
				if(ucgen.compareArea(kare) == 1)
					System.out.println(" Üçgen büyük.");
				else if(ucgen.compareArea(kare) == 0)
					System.out.println(" Eşit");
				else if(ucgen.compareArea(kare) == -1)
					System.out.println(" Kare büyük.");
			}

			else if(sec1 == 1 && sec2 ==3 || sec1 == 3 && sec2 == 1){
				System.out.println("Üçgenin Alanı: " + ucgen.getAlan());
				System.out.println("Dairenin Alanı: " + daire.getAlan());
				if(ucgen.compareArea(daire) == 1)
					System.out.println(" Üçgen büyük.");
				else if(ucgen.compareArea(daire) == 0)
					System.out.println(" Eşit");
				else if(ucgen.compareArea(daire) == -1)
					System.out.println(" Daire büyük.");
			}

			else if(sec1 == 1 && sec2 ==4 || sec1 == 4 && sec2 == 1){
				System.out.println("Üçgenin Alanı: " + ucgen.getAlan());
				System.out.println("Paralelkenarın Alanı: " + paralelkenar.getAlan());
				if(ucgen.compareArea(paralelkenar) == 1)
					System.out.println(" Üçgen büyük.");
				else if(ucgen.compareArea(paralelkenar) == 0)
					System.out.println(" Eşit");
				else if(ucgen.compareArea(paralelkenar) == -1)
					System.out.println(" ParalelKenar büyük.");
			} 

			else if(sec1 == 1 && sec2 ==5 || sec1 == 5 && sec2 == 1){
				System.out.println("Üçgenin Alanı: " + ucgen.getAlan());
				System.out.println("Yamuğun Alanı: " + yamuk.getAlan());
				if(ucgen.compareArea(yamuk) == 1)
					System.out.println(" Üçgen büyük.");
				else if(ucgen.compareArea(yamuk) == 0)
					System.out.println(" Eşit");
				else if(ucgen.compareArea(yamuk) == -1)
					System.out.println(" Yamuk büyük.");
			}

			else if(sec1 == 1 && sec2 == 6 || sec1 == 6 && sec2 == 1){
				System.out.println("Üçgenin Alanı: " + ucgen.getAlan());
				System.out.println("Karenin Alanı: " + kare.getAlan());
				if(ucgen.compareArea(dikdortgen) == 1)
					System.out.println(" Üçgen büyük.");
				else if(ucgen.compareArea(dikdortgen) == 0)
					System.out.println(" Eşit");
				else if(ucgen.compareArea(dikdortgen) == -1)
					System.out.println(" Dikdörtgen büyük.");
			}

			//////KARE//////

			else if(sec1 == 2 && sec2 == 3 || sec1 ==3 && sec2 == 2){
				System.out.println("Karenin Alanı: " + kare.getAlan());
				System.out.println("Dairenin Alanı: " + daire.getAlan());
				if(kare.compareArea(daire) == 1)
					System.out.println(" Kare büyük.");
				else if(kare.compareArea(daire) == 0)
					System.out.println(" Eşit");
				else if(kare.compareArea(daire) == -1)
					System.out.println(" Daire büyük.");
			}

			else if(sec1 == 2 && sec2 == 4 || sec1 == 4 && sec2 == 2){
				System.out.println("Karenin Alanı: " + kare.getAlan());
				System.out.println("Paralelkenarın Alanı: " + paralelkenar.getAlan());
				if(kare.compareArea(paralelkenar) == 1)
					System.out.println(" Kare büyük.");
				else if(kare.compareArea(paralelkenar) == 0)
					System.out.println(" Eşit");
				else if(kare.compareArea(paralelkenar) == -1)
					System.out.println(" Paralelkenar büyük.");
			}

			else if(sec1 == 2 && sec2 == 5 || sec1 == 5 && sec2 == 2){
				System.out.println("Karenin Alanı: " + kare.getAlan());
				System.out.println("Yamuğun Alanı: " + yamuk.getAlan());
				if(kare.compareArea(yamuk) == 1)
					System.out.println(" Kare büyük.");
				else if(kare.compareArea(yamuk) == 0)
					System.out.println(" Eşit");
				else if(kare.compareArea(yamuk) == -1)
					System.out.println(" Yamuk büyük.");
			}

			else if(sec1 == 2 && sec2 == 6 || sec1 == 6 && sec2 == 2){
				System.out.println("Karenin Alanı: " + kare.getAlan());
				System.out.println("Dikdortgenin Alanı: " + dikdortgen.getAlan());
				if(kare.compareArea(dikdortgen) == 1)
					System.out.println(" Kare büyük.");
				else if(kare.compareArea(dikdortgen) == 0)
					System.out.println(" Eşit");
				else if(kare.compareArea(dikdortgen) == -1)
					System.out.println(" Dikdörtgen büyük.");
			}
			/////DAİRE//////

			else if(sec1 == 3 && sec2 == 4 || sec1 == 4 && sec2 == 3){
				System.out.println("Dairenin Alanı: " + daire.getAlan());
				System.out.println("Paralelkenarın Alanı: " + paralelkenar.getAlan());
				if(daire.compareArea(paralelkenar) == 1)
					System.out.println(" Daire büyük.");
				else if(daire.compareArea(paralelkenar) == 0)
					System.out.println(" Eşit");
				else if(daire.compareArea(paralelkenar) == -1)
					System.out.println(" ParalelKenar büyük.");
			}

			else if(sec1 == 3 && sec2 == 5 || sec1 == 5 && sec2 == 3){
				System.out.println("Dairenin Alanı: " + daire.getAlan());
				System.out.println("Yamuğun Alanı: " + yamuk.getAlan());
				if(daire.compareArea(yamuk) == 1)
					System.out.println(" Daire büyük.");
				else if(daire.compareArea(yamuk) == 0)
					System.out.println(" Eşit");
				else if(daire.compareArea(yamuk) == -1)
					System.out.println(" Yamuk büyük.");
			}

			else if(sec1 == 3 && sec2 == 6 || sec1 == 6 && sec2 == 3){
				System.out.println("Dairenin Alanı: " + daire.getAlan());
				System.out.println("Dikdortgenin Alanı: " + dikdortgen.getAlan());
				if(daire.compareArea(dikdortgen) == 1)
					System.out.println(" Daire büyük.");
				else if(daire.compareArea(dikdortgen) == 0)
					System.out.println(" Eşit");
				else if(daire.compareArea(dikdortgen) == -1)
					System.out.println(" Dikdörtgen büyük.");
			}

			/////// PARALEL KENAR ///////

			else if(sec1 == 4 && sec2 == 5 || sec1 == 5 && sec2 == 4){
				System.out.println("Paralelkenarın Alanı: " + paralelkenar.getAlan());
				System.out.println("Yamuğun Alanı: " + yamuk.getAlan());
				if(paralelkenar.compareArea(yamuk) == 1)
					System.out.println(" ParalelKenar büyük.");
				else if(paralelkenar.compareArea(yamuk) == 0)
					System.out.println(" Eşit");
				else if(paralelkenar.compareArea(yamuk) == -1)
					System.out.println(" Yamuk büyük.");
			}
			else if(sec1 == 4 && sec2 == 6 || sec1 == 6 && sec2 == 4){
				System.out.println("Paralelkenarın Alanı: " + paralelkenar.getAlan());
				System.out.println("Dikdortgenin Alanı: " + dikdortgen.getAlan());
				if(paralelkenar.compareArea(dikdortgen) == 1)
					System.out.println(" ParalelKenar büyük.");
				else if(paralelkenar.compareArea(dikdortgen) == 0)
					System.out.println(" Eşit");
				else if(paralelkenar.compareArea(dikdortgen) == -1)
					System.out.println(" Dikdörtgen büyük.");
			}

			/////DİKDÖRTGEN//////

			else if(sec1 == 5 && sec2 == 6 || sec1 == 6 && sec2 == 5){
				System.out.println("Dikdortgenin Alanı: " + dikdortgen.getAlan());
				System.out.println("Yamuğun Alanı: " + yamuk.getAlan());
				if(dikdortgen.compareArea(yamuk) == 1)
					System.out.println(" Dikdörtgen büyük.");
				else if(dikdortgen.compareArea(yamuk) == 0)
					System.out.println(" Eşit");
				else if(dikdortgen.compareArea(yamuk) == -1)
					System.out.println(" Yamuk büyük.");
			}

		}

		else{
			System.out.println("Yanlış bir değer girdiniz. \n");
			main(args);
		}	

	}
}
