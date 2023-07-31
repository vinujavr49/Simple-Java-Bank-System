import java.util.Scanner;

public class NewAccount {
    public static void creatingaNewUserAccount() {


            //Program is going to create a new bank account
            System.out.println("Creating a new user account.....");

            //Getting first name and last name form the user
            Scanner myScannerForNewAccount = new Scanner(System.in);

            System.out.print("Please enter your first name: ");
            String firstNameOfOwner = myScannerForNewAccount.next();

            System.out.print("Please enter your second name: ");
            String secondNameOfOwner = myScannerForNewAccount.next();

            //Getting age form the user
            System.out.print("Please enter your age: ");
            int ageOfOwner = myScannerForNewAccount.nextInt();


            //Passing the parameter to the User class constructor and create new user_1 object based on input values
            User user_1 = new User(firstNameOfOwner, secondNameOfOwner, ageOfOwner);
            //System.out.println(user_1.getFirstOfOwner(firstNameOfOwner));

            //Getting account type information from the user
            Main.blankSpace();
            System.out.println("         1.SAVINGS_ACCOUNT");
            System.out.println("         2.CHECKING_ACCOUNT");
            System.out.println("         3.CERTIFICATE_OF_DEPOSIT_ACCOUNT");
            System.out.println("         4.MONEY_MARKET_ACCOUNT");
            System.out.println("         5.INDIVIDUAL_RETIREMENT_ACCOUNT");
            System.out.println("         6.JOINT_ACCOUNT");
            System.out.println("         7.BUSINESS_ACCOUNT");
            System.out.println("         8.STUDENT_ACCOUNT");
            System.out.println("         9.TRUST_ACCOUNT");
            System.out.println("         10.HIGH_YIELD_SAVINGS_ACCOUNT");
            Main.blankSpace();

            System.out.print("Please select your prefer Account Type:- ");
            int accountTypeSelector = myScannerForNewAccount.nextInt();
            AccountType selectedAccountType = null;
            /*
            The error message "variable selectedAccountType might not have been initialized" occurs because
            the selectedAccountType variable is declared inside an if-else block,
            and the compiler is not able to guarantee that the variable will be initialized before it is used later in the code.

            The issue arises because if none of the conditions in the if-else block are met,
            the variable selectedAccountType will not have any value assigned to it. In Java,
            you must ensure that all variables are initialized before you use them.

            To fix this error, you can either provide an initial value for selectedAccountType when declaring it or provide a default
            value in the else block to handle the case when none of the conditions are met.

            With this change, you provide a default value (null in this case) to the selectedAccountType variable in the else block to ensure
            it is initialized before being used later in the code. Additionally, you can add a null-check before using selectedAccountType
            to handle the case when the user enters an invalid account type.
            */

            if (accountTypeSelector == 1) {
                selectedAccountType = AccountType.SAVINGS_ACCOUNT;
                // System.out.println(selectedAccountType);
            } else if (accountTypeSelector == 2) {
                selectedAccountType = AccountType.CHECKING_ACCOUNT;
            } else if (accountTypeSelector == 3) {
                selectedAccountType = AccountType.CERTIFICATE_OF_DEPOSIT_ACCOUNT;
            } else if (accountTypeSelector == 4) {
                selectedAccountType = AccountType.MONEY_MARKET_ACCOUNT;
            } else if (accountTypeSelector == 5) {
                selectedAccountType = AccountType.INDIVIDUAL_RETIREMENT_ACCOUNT;
            } else if (accountTypeSelector == 6) {
                selectedAccountType = AccountType.JOINT_ACCOUNT;
            } else if (accountTypeSelector == 7) {
                selectedAccountType = AccountType.BUSINESS_ACCOUNT;
            } else if (accountTypeSelector == 8) {
                selectedAccountType = AccountType.STUDENT_ACCOUNT;
            } else if (accountTypeSelector == 9) {
                selectedAccountType = AccountType.TRUST_ACCOUNT;
            } else if (accountTypeSelector == 10) {
                selectedAccountType = AccountType.HIGH_YIELD_SAVINGS_ACCOUNT;
            } else {
                System.out.println("Invalid Input");
            }

            Account account_1 = new Account(selectedAccountType); //new account object created using constructor of account class
            account_1.getBankID();

            //Getting input from user about statingAmount
            Scanner scannerOfStartingAmount = new Scanner(System.in);
            System.out.print("Please enter your starting amount: ");
            double statingAmount  = scannerOfStartingAmount.nextInt();

            System.out.println("----------------------------------------");
            System.out.println("Your account has been created");
            Main.blankSpace();
            System.out.println("Account Type         : " + selectedAccountType);
            System.out.println("Account ID           : " + account_1.getBankID());
            System.out.println("Name of the owner    : " + firstNameOfOwner + " " + secondNameOfOwner);
            System.out.println("Age of the owner     : " + ageOfOwner);
            System.out.println("Current balance      : " + statingAmount);

            myScannerForNewAccount.close();   //Closing the myScannerForNewAccount object



    }
}