
public class Transactions {
	
	public static void BalanceInqurity(int Balance){
		
		System.out.println("Balance = " + Balance);
		
	}
	
	public static int Deposit(int Balance, int sum1){
		
		return Balance += sum1;
	}
	
	public static int Withdraval(int Balance, int sum2){
		
		return Balance -= sum2;
	}
	
	public static int Transfer(int Balance, int sum3){
		
		return (Balance - sum3);
			
	}
}