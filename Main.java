package AccountBank;
package AccountBank.entities.Account;

public class Main {
    public static void main(String[] args) {
        Account personalAccount = new PersonalAccount("123456", 1000.0, 500.0);
        Account businessAccount = new BusinessAccount("654321", 2000.0, 10000.0);

        personalAccount.deposit(200.0);
        personalAccount.withdraw(300.0);
        System.out.println(personalAccount);

        businessAccount.deposit(500.0);
        ((BusinessAccount) businessAccount).requestLoan(3000.0);
        System.out.println(businessAccount);
    }
}

