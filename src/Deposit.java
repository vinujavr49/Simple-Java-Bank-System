import java.util.Scanner;

public class Deposit {
    public static void depositMoney() {
        Scanner depAmountScanner = new Scanner(System.in);
        System.out.print("Please enter the deposit amount: ");
        double depAmount = depAmountScanner.nextDouble();

        User.currentBal = NewAccount.getStatingAmount() + depAmount;
        System.out.println(User.currentBal);

        depAmountScanner.close();

    }





}
