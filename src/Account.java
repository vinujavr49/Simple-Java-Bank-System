public class Account {
    //Attributes of the Account class
    private int bankID = 139908495;
    private AccountType accountType;

    //Constructor of the Account class
    public Account (AccountType accountType){
        this.accountType = accountType;
    }

    //Getters
    //Creating a getter for bankID

    public int getBankID(){
        this.bankID = bankID + 1;
        return bankID;
    }



    //Creating a getter for AccountType
    public AccountType getAccountType(AccountType accountType){
        this.accountType = accountType;
        return accountType;
    }

    public int genarateNewBankID(){
        this.bankID =  bankID +1;
        return bankID;
    }

    public AccountType SAVINGS_ACCOUNT(){
        return AccountType.SAVINGS_ACCOUNT;
    }
}
