
public class Screen{
    // display message without trailing newline
    public void displayMessage(String message){
        System.out.print(message);
    }
    // display message with trailing newline
    public void displayMessageLine(String message){
        System.out.println(message);
    }
    // displays a dollar amount
    public void displayDollarAmount(double amount){
        System.out.printf("$%,.2f", amount);
    }
}
