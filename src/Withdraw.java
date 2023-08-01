import java.util.Scanner;

public class Withdraw {

    public static double withDrawAmt;

    public static void withdrawMoney(){
        System.out.print("Please enter your withdraw amount: ");
        Scanner myWthdrawScanner = new Scanner(System.in);
        double withDrawAmt = myWthdrawScanner.nextDouble();
        Validator.withdrawAmtValidator(withDrawAmt);









    }
}
