
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account account1 = new Account("Matthews account",1000);
        Account myAccount = new Account("My account",0);
        account1.withdrawal(100);
        myAccount.deposit(100);
        System.out.println(account1.toString());
        System.out.println(myAccount.toString());
    }
}
