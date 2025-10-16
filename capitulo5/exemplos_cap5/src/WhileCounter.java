public class WhileCounter {
    public static void main(String[] args) {
        int counter = 0; // declara e inicializa a variável de controle

        while(counter <= 10) { // Condição de continuação do loop
            System.out.printf("%d ", counter);
            ++counter; // variávei de controle de incremento
        }
        System.out.println();
    }
}
