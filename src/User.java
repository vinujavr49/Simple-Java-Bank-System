import java.util.Scanner;

public class User {
    //Attributes of the User class
    private String firstNameOfOwner;
    private String secondNameOfOwner;
    private int ageOfOwner;

    public static double currentBal;

    //Constructor of the User class
    public User(String firstNameOfOwner , String secondNameOfOwner , int ageOfOwner){
        this.firstNameOfOwner = firstNameOfOwner;
        this.secondNameOfOwner = secondNameOfOwner;
        this.ageOfOwner = ageOfOwner;
    }

    //Getters
    // Creating a getter for firstOfOwner
    public String getFirstOfOwner(String firstOfOwner){
        this.firstNameOfOwner = firstOfOwner;
        return firstOfOwner;
    }

    // Creating a getter for secondNameOfOwner
    public String getSecondNameOfOwner(String secondNameOfOwner){
        this.secondNameOfOwner = secondNameOfOwner;
        return secondNameOfOwner;
    }



    /*public static void currentBalUpadator(){
        double currentBal = NewAccount.statingAmount;

     */





}
