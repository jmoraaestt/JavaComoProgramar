public class LimiteCreditoTest {
    public static void main(String args[]) {
        LimiteCredito limiteCredito1 = new LimiteCredito(123456, 1500, 1300, 1000, 102);
        LimiteCredito limiteCredito2 = new LimiteCredito(345678, 2900, 900, 100, 4000);

        limiteCredito1.displayCliente();
        limiteCredito1.novoSaldo();

        limiteCredito2.displayCliente();
        limiteCredito2.novoSaldo();
    }
}
