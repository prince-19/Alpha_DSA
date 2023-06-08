public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Princ Kumar";
        // myAcc.password = "12345";   // not visible as it is private
        myAcc.setPassword("12345");
        // System.out.println(myAcc.password); // can't be printed as password is private
        
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}
