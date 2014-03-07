
public class PrimeNumberControl {

	public static boolean cntrl(int i){
		
		int j ;
		
		for (j = 2; j < i; j++) {
			
			if(i % j == 0)
				return false;
			
		}
		
		return true;
	}
	
}
