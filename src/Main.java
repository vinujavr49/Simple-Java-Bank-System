import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Menu
        System.out.println("      1.Creating a new user account");
        System.out.println("      2.Deposit Money");
        System.out.println("      3.Withdraw Money");
        System.out.println("      4.Print existing user account statement");
        System.out.println("      5.Change your account Type (verification need)");
        System.out.println("                                                      ");
        System.out.print("Please select your option: ");

        //Creating a object form scanner class
        Scanner myScannerForMenu = new Scanner(System.in );

        //Getting user input and store in the selectedOption variable
        int selectedOption = myScannerForMenu.nextInt();

        if (selectedOption == 1){
            Scanner myScannerForNewAccount = new Scanner(System.in);

        }



    }
}