public class Bank {
    // creating a fields(variables)
    private String  userNumber;
    private double userBalance;
    private String userName;
    private String user_Email;
    private String userPhone_number;

    // Constructor
    public Bank(String userNumber, double userBalance, String userName, String user_Email, String userPhone_number) {
            // initialize
            this.userNumber = userNumber;
            this.userBalance = userBalance;
            this.userName = userName;
            this.user_Email = user_Email;
            this.userPhone_number = userPhone_number;
    }

    // method
    public void user_deposit(double deposited_money){
        this.userBalance+= deposited_money;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public double getUserBalance() {
        return userBalance;
    }

    public void setUserBalance(double userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }

    public String getUserPhone_number() {
        return userPhone_number;
    }

    public void setUserPhone_number(String userPhone_number) {
        this.userPhone_number = userPhone_number;
    }
}