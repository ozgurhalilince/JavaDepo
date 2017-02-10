public class PrimeNumberControl {

	public static boolean cntrl(int i){
		
		if(i < 2) return false;
		int N =  Math.sqrt(a);
		for (int j = 2; j <  N; j++)
			if(i % j == 0)
				return false;
		return true;
	}
	
}
