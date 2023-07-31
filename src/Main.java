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
        System.out.println(""                                );

        if (selectedOption == 1){
            //Program is going to create a new bank account

            //Getting first name and last name form the user
            System.out.println("Creating a new user account.....");
            Scanner myScannerForNewAccount = new Scanner(System.in);

            System.out.print("Please enter your first name: ");
            String firstNameOfOwner = myScannerForNewAccount.next();

            System.out.print("Please enter your second name: ");
            String secondNameOfOwner = myScannerForNewAccount.next();

            //Getting age form the user
            System.out.print("Please enter your age: ");
            int ageOfOwner = myScannerForNewAccount.nextInt();

            //Passing the parameter to the constructor and create new user_1 object based on input values
            User user_1 = new User(firstNameOfOwner , secondNameOfOwner, ageOfOwner);
            //System.out.println(user_1.getFirstOfOwner(firstNameOfOwner));

            //Getting details regarding account type from user















        }



    }
}