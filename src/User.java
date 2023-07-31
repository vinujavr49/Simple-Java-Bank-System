public class User {
    //Attributes of the User class
    private String firstOfOwner;
    private String secondNameOfOwner;
    private int ageOfOwner;

    //Constructor of the User class
    public User(String firstOfOwner , String secondNameOfOwner , int ageOfOwner){
        this.firstOfOwner = firstOfOwner;
        this.secondNameOfOwner = secondNameOfOwner;
        this.ageOfOwner = ageOfOwner;
    }

    //Getters
    // Creating a getter for firstOfOwner
    public String getFirstOfOwner(String firstOfOwner){
        this.firstOfOwner = firstOfOwner;
        return firstOfOwner;
    }

    // Creating a getter for secondNameOfOwner
    public String getSecondNameOfOwner(String secondNameOfOwner){
        this.secondNameOfOwner = secondNameOfOwner;
        return secondNameOfOwner;
    }


}
