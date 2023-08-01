public class Validator {

    public static void agevalidator(int ageOfOwner ){
        if (ageOfOwner > 18 & ageOfOwner < 100){
            return ;

    }
        else {
            System.out.println("Invalid Age Input");
        }
    }

    public static void withdrawAmtValidator(double withDrawAmt){
        if (Withdraw.withDrawAmt > User.currentBal ){
            System.out.println("This amount of money cannot be withdrawn");
        }
        else {
           User.currentBal = User.currentBal - Withdraw.withDrawAmt;
            System.out.println("Money Withdrawing Process....");
            System.out.println("------------------------");
            System.out.println("Money Withdrawing successful");
            System.out.println("------------------------");
            System.out.println("Account Statement");

        }

    }


}
