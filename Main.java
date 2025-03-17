
import java.util.Scanner;
//main class
public class Main {

    //Main method entrance of your program
    public static void main (String[] args)
    {
        //System.out.println("Hello World"); //print text to screen: Console.Writeline
        //how to do Console.Readline()

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = scanner.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input

        System.out.println( "what year were you born?");

        int year = scanner.nextInt();

        int age = 2025-year;

        System.out.println("You are"+age+"years old");
    }
}