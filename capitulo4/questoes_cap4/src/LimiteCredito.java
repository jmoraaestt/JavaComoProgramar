public class LimiteCredito {

    // Variáveis de instância
    private int numeroConta;
    private int saldoInicioMes;
    private int totalItensCobrados;
    private int totalCreditos;
    private int limiteAutorizado;

    // Construtor
    public LimiteCredito(int numeroConta, int saldoInicioMes, int totalItensCobrados, int totalCreditos, int limiteAutorizado) {
        this.numeroConta = numeroConta;
        this.saldoInicioMes = saldoInicioMes;
        this.totalItensCobrados = totalItensCobrados;
        this.totalCreditos = totalCreditos;
        this.limiteAutorizado = limiteAutorizado;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoInicioMes(int saldoInicioMes) {
        this.saldoInicioMes = saldoInicioMes;
    }
    public int getSaldoInicioMes() {
        return saldoInicioMes;
    }

    public void setTotalItensCobrados(int totalItensCobrados) {
        this.totalItensCobrados = totalItensCobrados;
    }
    public int getTotalItensCobrados() {
        return totalItensCobrados;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setLimiteAutorizado(int limiteAutorizado) {
        this.limiteAutorizado = limiteAutorizado;
    }
    public int getLimiteAutorizado() {
        return limiteAutorizado;
    }

    public void displayCliente() {
        System.out.print("\n======================");
        System.out.printf("%nNúmero da conta: %d%nSaldo no início do mês: R$:%d%nTotal de todos os itens cobrados: R$:%d%n" +
                "Total de créditos aplicados: R$:%d%nLimite de crédito autorizado: R$:%d", getNumeroConta(), getSaldoInicioMes(),getTotalItensCobrados(), getTotalCreditos(), getLimiteAutorizado());
        System.out.print("\n======================");
    }

    public void novoSaldo() {
        float novoSaldo;
        System.out.print("\n=== NOVO SALDO ===");
        novoSaldo = (float) saldoInicioMes + totalItensCobrados - totalCreditos;
        System.out.printf("%nO novo saldo é: R$: %.2f", novoSaldo);

        if(novoSaldo > limiteAutorizado) {
            System.out.print("\n LIMITE EXCEDIDO!");
        }
    }

}


