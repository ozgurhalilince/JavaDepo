import java.util.Scanner;


public class TheBankSystemMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String pw1 = "9999", id1 = "ozgur";
		String pw2, id2, choice,choice2;
		int Balance = 4500;
		int sum1,sum2;
		Scanner input = new Scanner(System.in);

		System.out.println("\t\t\t Welcome to INCEBANK\n");
		for(;;){
			System.out.print("Username: ");
			id2 = input.next();
			System.out.print("Password: ");
			pw2 = input.next();

			if(id2.equals(id1) && pw2.equals(pw1))		
				break;		
			else
				System.out.println("\nIncorrect Username or Password !\n");
		}
		do{
			try{
				menu();

				System.out.print("Enter your choice: ");
				choice = input.next();

				if(choice.equals("1"))
					Transactions.BalanceInqurity(Balance);

				else if (choice.equals("2")){
					System.out.println("Enter the amount of money: ");
					sum1 = input.nextInt();
					Balance = Transactions.Deposit(Balance,sum1);
					System.out.println("The New Balance Inquiry: " + Balance);
				}

				else if (choice.equals("3")){
					System.out.println("Enter the amount of money: ");
					sum2 = input.nextInt();
					Balance = Transactions.Withdraval(Balance, sum2);
					System.out.println("The New Balance Inquiry: " + Balance);
				}

				else if(choice.equals("4")){

					int OtherAccountNumber, sum3;
					for(;;){
						System.out.println("Please enter Other Account Number:");
						OtherAccountNumber = input.nextInt();

						System.out.println("Please enter amount of money: ");
						sum3 = input.nextInt();
						if(sum3 <= Balance){
							Balance = Transactions.Transfer(Balance,sum3);
							System.out.println("The New Balance Inquiry: " + Balance);
							break;
						}
						else
							System.out.println("Insuficient Balance! ");
					}
				}

				else if(choice.equals("5"))
					System.exit(-1);
			

			}catch(Exception e){
				System.out.println("You have entered a wrong option.\n\n");
				main(args);
			}
			for(;;){
				System.out.print("Do you want to make another transacitons? (y/n) :");
				choice2 = input.next();
				if(choice2.equals("y") || choice2.equals("n"))
					break;
				else
					System.out.println("You have entered a wrong option.");
			}

		}while(choice2.equals("y"));
		
		if(choice2.equals("n"))
			System.out.println("\n\n\t\t\t Good Bye...\n\n");
	}


	public static void menu(){
		System.out.println("   1   ==   Balance Inquiry  ");
		System.out.println("   2   ==   Deposit ");
		System.out.println("   3   ==   Withdraval");
		System.out.println("   4   ==   Transfer ");
		System.out.println("   5   ==   Exit");
	}
}