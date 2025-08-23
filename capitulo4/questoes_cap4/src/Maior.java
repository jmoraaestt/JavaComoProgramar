import java.util.Scanner;

public class Maior {
    public static void main(String args[]) {

        // Variáveis
        int counter = 0;
        int numero;
        int largest = 0;

        Scanner input = new Scanner(System.in);

        while(counter < 10) {
            counter += 1;
            System.out.print("Digite um número inteiro: \n");
            numero = input.nextInt();

            if(numero > largest) {
                largest = numero;
            }
        }
        System.out.printf("Maior Numero: %d\n", largest);

    }
}
