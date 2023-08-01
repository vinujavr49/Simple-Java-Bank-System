import java.util.Scanner;

public class Deposit {
    public static void depositMoney() {
        Scanner depAmountScanner = new Scanner(System.in);
        System.out.print("Please enter the deposit amount: ");
        double depAmount = depAmountScanner.nextDouble();

        double currentBal = NewAccount.getStatingAmount() + depAmount;
        System.out.println(currentBal);

    }





}
