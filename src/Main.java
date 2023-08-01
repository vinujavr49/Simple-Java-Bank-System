import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Menu
        System.out.println("      1.Creating a new user account");
        System.out.println("      2.Deposit Money");
        System.out.println("      3.Withdraw Money");
        System.out.println("      4.Print existing user account statement");
        System.out.println("      5.Change your account Type (verification need)");
        Main.blankSpace();
        System.out.print("Please select your option: ");

        //Creating a object form scanner class
        Scanner myScannerForMenu = new Scanner(System.in);

        //Getting user input and store in the selectedOption variable
        int selectedOption = myScannerForMenu.nextInt();
        Main.blankSpace();
            //Closing the myScannerForMenu object

        if (selectedOption == 1) {
            NewAccount.creatingaNewUserAccount();
            myScannerForMenu.close();
        } else if (selectedOption == 2) {
            Deposit.depositMoney();

        } else if (selectedOption == 3) {
            Withdraw.withdrawMoney();
        }

        //System.out.println(selectedAccountType);

            //System.out.println("Bnak ID is " + account_1.getBankID());




















        }


    public static void blankSpace() {
        System.out.println("                                            ");

    }
}
