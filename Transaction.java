
public abstract class Transaction{
    private int accountNumber;

    private Screen screen;
    private BankDatabase bankDatabase;

    // CONSTRUCTOR
    // invoked by subclasses using super()
    public Transaction(int userAccountNumber, Screen atmScreen,
            BankDatabase atmBankDatabase){
        accountNumber = userAccountNumber;
        screen = atmScreen;
        bankDatabase = atmBankDatabase;
    }
    // GETTERS
    public int getAccountNumber(){
        return accountNumber;
    }
    public Screen getScreen(){
        return screen;
    }
    public BankDatabase getBankDatabase(){
        return bankDatabase;
    }
    // ABSTRACT METHODS
    // perform the transaction
    abstract public void execute();
}
