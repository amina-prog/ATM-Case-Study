
import java.util.Scanner;

public class Keypad{
    private Scanner sc;

    // CONSTRUCTOR
    // no arg constructor initialises the scanner
    public Keypad(){
        sc = new Scanner(System.in);
    }
    // returns an integer value entered by the user
    public int getInput(){
        return sc.nextInt();
    }
}
