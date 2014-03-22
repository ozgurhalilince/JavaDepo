import java.util.Scanner;


public class Test {


	public static void main(String[] args) {

		int secim = 0;
		Scanner input = new Scanner(System.in);	
		Ucgen ucgen = new Ucgen();
		Yamuk yamuk = new Yamuk();
		Kare kare = new Kare();
		Daire daire = new Daire();
		ParalelKenar paralelkenar = new ParalelKenar();
		Dikdortgen dikdortgen = new Dikdortgen();

		menu();
		for(;;){
			System.out.print("\nSeçiminizi giriniz: ");
			try{
				secim = input.nextInt();
			}catch (Exception e) {
				System.out.println("Yanlis bir giris yaptınız. Lutfen başa dönünüz.");
				main(args);
			}
			try{
				switch (secim) {
				case 1:
					System.out.print("Taban uzunluğu: ");
					ucgen.setTaban(input.nextDouble());
					System.out.print("Yukseklik: ");
					ucgen.setYukseklik(input.nextDouble());
					if(ucgen.getAlan() == -1){
						System.out.println("Yanlış bir değer girdiniz. ");
						main(args);
					}
					else
						System.out.println("Alan: " + ucgen.getAlan());
					break;

				case 2:
					System.out.print("Kenar Uzunluğu: ");
					kare.setKenar(input.nextDouble());
					if(kare.getAlan() == -1){
						System.out.println("Yanlış bir değer girdiniz. ");
						main(args);
					}
					else
						System.out.println("Alan: " + kare.getAlan());
					break;
					
				case 3:
					System.out.print("Yarıçap uzunluğu: ");
					daire.setYaricap(input.nextDouble());
					if(daire.getAlan() == -1){
						System.out.println("Yanlış bir değer girdiniz. ");
						main(args);
					}
					else
						System.out.println("Alan: " + daire.getAlan());
					break;

				case 4:
					System.out.print("Yükseklik: ");
					paralelkenar.setYukseklik(input.nextDouble());
					System.out.print("Taban Uzunluğu: ");
					paralelkenar.setTaban(input.nextDouble());
					if(paralelkenar.getAlan() == -1){
						System.out.println("Yanlış bir değer girdiniz. ");
						main(args);
					}
					else
						System.out.println("Alan: " + paralelkenar.getAlan());
									
					break;

				case 5: 
					System.out.print("Alt Kenar Uzunluğu: ");
					yamuk.setAltTaban(input.nextDouble());
					System.out.print("Ust Kenar Uzunluğu: ");
					yamuk.setUstTaban(input.nextDouble());
					System.out.print("Yükseklik: ");
					yamuk.setYukseklik(input.nextDouble());
					if(yamuk.getAlan() == -1){
						System.out.println("Yanlış bir değer girdiniz. ");
						main(args);
					}
					else
						System.out.println("Alan: " + yamuk.getAlan());
					break;

				case 6:
					System.out.print(" Kısa kenar: ");
					dikdortgen.setKisaKenar(input.nextDouble());
					System.out.print(" Uzun henar: ");
					dikdortgen.setUzunKenar(input.nextDouble());
					if(dikdortgen.getAlan() == -1){
						System.out.println("Yanlış bir değer girdiniz. ");
						main(args);
					}
					else
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
	}

	public static void menu(){

		
		System.out.println(" 1. Üçgen");
		System.out.println(" 2. Kare ");
		System.out.println(" 3. Daire ");
		System.out.println(" 4. ParalelKenar");
		System.out.println(" 5. Yamuk");
		System.out.println(" 6. Dikdörtgen");
	}

}
