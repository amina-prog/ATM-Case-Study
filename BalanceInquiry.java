public class BalanceInquiry extends Transaction{
    // CONSTRUCTOR
    public BalanceInquiry(int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase){
        super(userAccountNumber, atmScreen, atmBankDatabase);
    }
    // perform the transaction
    @Override
    public void execute(){
        // get reference to bank database and screen
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        // get available balance for account involved
        double availableBalance = bankDatabase.getAvailableBalance(getAccountNumber());

        // get total balance for account involved
        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

        // display balance information on the screen
        screen.displayMessageLine("\nBalance information:");
        screen.displayMessage(" - Available balance: ");
        screen.displayDollarAmount(availableBalance);
        screen.displayMessage("\n - Total balance: ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    }
}
