
import java.util.Scanner;


public class Test {


	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice = 0;
		double radius,lenght;
		
		Circle c1 = new Circle();
		Square s1 = new Square();
		for(;;){
			try{
				System.out.println("Welcome to Circle/Square Tester. Please select an entry from menu: ");
				menu();
				choice = input.nextInt();
			}catch (Exception e) {
				System.out.println("\nYou have entered wrong option. \n");
				main(args);
			}
			
			switch (choice) {
			case 1:
				System.out.print("\nEnter radius: ");
				radius = input.nextDouble();
				c1.setRadius(radius);
				break;
			case 2:
				System.out.print("\nEnter lenght: ");
				lenght = input.nextDouble();
				s1.setLenght(lenght);
				break;
			case 3:
				System.out.println("Circle area = " + c1.getArea() + 
						"           Square area = " + s1.getArea());
				if(c1.compareArea(s1) == -1)
					System.out.println("\nSquare is bigger than circle\n");
				else if (c1.compareArea(s1) == 0)
					System.out.println("\nSquare's area and Circle's area are equal.\n");
				else if(c1.compareArea(s1) == 1)
					System.out.println("\nCircle is bigger than square\n");
				
				break;
			case 4:
				System.exit(-1);
			default:
				System.out.println("\nYou have entered wrong option. \n");
				break;
			}
			
			
		}


	}

	public static void menu(){
		System.out.println("\n1 - Modify a circle object");
		System.out.println("2 - Modify a square object ");
		System.out.println("3 - Compare square and circle ");
		System.out.println("4 - Exit ");
	}
}

