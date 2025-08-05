// Cria e manipula um objeto Account
import java.util.Scanner;


public class AccountTests {
    // Método para mostrar o nome e o Balance
    public static void displayAccount(Account accountToDisplay) {
        System.out.printf("%s balance: $%.2f %n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
    public static void main(String[] args) {

        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // Exibe saldo inicial de cada objeto
        displayAccount(account1);
        displayAccount(account2);

        // Cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding %.2f to account1 balance%n%n",
                depositAmount);
        account1.deposit(depositAmount);

        System.out.print("Withdraw account1: ");
        double withDrawAmount = input.nextDouble();
        System.out.printf("%nWithdraw %.2f to account1 balance: %n%n", withDrawAmount);
        account1.withdraw(withDrawAmount);

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);

        System.out.print("Deposit amount for account2 ");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to account2 balance%n%n",
                depositAmount);
        account2.deposit(depositAmount);

        System.out.print("Withdraw account2: ");
        withDrawAmount = input.nextDouble();
        System.out.printf("%nWithdraw $%.2f to account1 balance: %n%n", withDrawAmount);
        account2.withdraw(withDrawAmount);

        // exibe os saldos
        displayAccount(account1);
        displayAccount(account2);


    }
}