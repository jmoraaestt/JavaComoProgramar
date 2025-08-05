public class Account {

    private String name; // Variável de instância
    private double balance; // Variável de instância

    // Construtor de Account que recebe dois parâmetros
    public Account (String name, double balance) {

        this.name = name; // Atribuí name a variável de instância

        // Valida que balance é maior que 0.0; se não for, a variável de instância balance mantém
        // seu valor inicial padrão para 0.0
        if(balance > 0.0) // se o saldo for válido
            this.balance = balance; // atribuí á variável de instância balance
    }

    // Método que adiciona apenas uma quantia válida de saldo
    public void deposit(double depositAmount) {
        if(depositAmount > 0.0) // se depositAmount for válido
            balance = balance + depositAmount;
    }

    // Método para retirar dinheiro
    public void withdraw(double amountWithdraw) {
        if(balance >= amountWithdraw)
            balance = balance - amountWithdraw;
        else
            System.out.print("\nWithdrawal amount exceeded account balance");
    }

    // Método que retorna o saldo da conta
    public double getBalance(){
        return balance;
    }

    // Método que define o nome
    public void setName(String name) {
        this.name = name;
    }

    // método que retorna o nome
    public String getName() {
        return name;
    }


}