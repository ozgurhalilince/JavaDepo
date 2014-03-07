
public class Cntrl {

	public static int ctrl(int sayi){
		
		int basamak = 0;
		
		while(sayi > 0) {
			
			sayi = sayi / 10;
			basamak++;
		}
			
		return basamak;
		
	}

}
