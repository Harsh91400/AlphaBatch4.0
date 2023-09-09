package C_19_OOPS;

public class Access_Modifiers {
    public static void main(String[] args) {
        BankAcc acc = new BankAcc();
        acc.username="Harshit";
//        acc.password="Harsh";
        acc.setPassword("Harsh");
//        System.out.println(acc.password);
    }
}
class BankAcc{
    public String username;
    private String password;
    public void setPassword(String newPassword){
        password = newPassword;
//        System.out.println(password);
    }
}
