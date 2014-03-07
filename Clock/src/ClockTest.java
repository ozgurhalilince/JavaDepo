
import java.util.Scanner;


public class ClockTest {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);//Instantiate Scanner class
        Clock c1=new Clock();//Create a new Clock object
        c1.setName("Local Time Zone");//Set name
        c1.displayTime();
        System.out.print("Enter local hour: ");
        c1.setHours(input.nextInt());//Get hours from user
        System.out.print("Enter local minute: ");
        c1.setMinutes(input.nextInt());//Get minutes from user
        System.out.print("Enter local second: ");
        c1.setSeconds(input.nextInt());//Get seconds from user
        c1.displayTime();
        Clock c2=new Clock(c1);//Instantiate a new Clock object using another constructor
        c2.displayTime();
        c2.incrementHours(2);//Increment hours by 2
        c2.setName("Europe Time Zone");
        c2.displayTime();
        Clock c3=new Clock(c1);
        c3.setName("New York City Time Zone");
        c3.incrementHours(-7);//Decrement hours by 7
        c3.displayTime();        
        Clock c4=new Clock(11, 11, 11);
        c4.setName("Clock 11");
        c4.displayTime();
        c4.incrementSeconds(600);
        c4.displayTime();
        c4.incrementMinutes(800);
        c4.displayTime();
    }    
}