public class Account {
    //Attributes of the Account class
    private int bankID;
    private AccountType accountType;

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
