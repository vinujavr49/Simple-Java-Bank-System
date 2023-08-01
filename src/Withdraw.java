import java.util.Scanner;

public class Withdraw {

    public static void withdrawMoney(){
        System.out.print("Please enter your withdraw amount: ");
        Scanner myWthdrawScanner = new Scanner(System.in);
        double withDrawAmt = myWthdrawScanner.nextDouble();

        if ((NewAccount.getStatingAmount() || User.currentBal) > withDrawAmt ){
            System.out.println("Money Withdrawing Process....");
            Main.blankSpace();
            System.out.println(------------------------);
            Main.blankSpace();
            System.out.println("Money Withdrawing successful");
            System.out.println(------------------------);
            System.out.println("Account Statement");

        }


    }
}
