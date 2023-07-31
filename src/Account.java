public class Account {
    //Attributes of the Account class
    private int bankID;
    private AccountType accountType;

    //Constructor of the Account class
    public Account (int bankID , AccountType accountType){
        this.bankID = bankID;
        this.accountType = accountType;
    }

    //Getters
    //Creating a getter for bankID
    public int getBankID(int bankID){
        this.bankID = bankID;
        return bankID;
    }

    //Creating a getter for AccountType
    public AccountType getAccountType(AccountType accountType){
        this.accountType = accountType;
        return accountType;
    }
}
