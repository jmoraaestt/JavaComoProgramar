import java.util.Scanner;

public class DoisMaiores {
    public static void main(String args[]) {

        // Variáveis
        int counter = 0;
        int numero;
        int largest = 0;
        int segundoMaior = 0;

        Scanner input = new Scanner(System.in);

        while (counter < 10) {
            counter += 1;
            System.out.print("Digite um número inteiro: \n");
            numero = input.nextInt();

            if (numero > largest) {
                segundoMaior = largest;
                largest = numero;
            }
            if(numero > segundoMaior && numero != largest) {
                segundoMaior = numero;
                }
            }
            System.out.printf("Maior Numero: %d\n", largest);
            System.out.printf("Segundo maior Numero: %d\n", segundoMaior);
        }
    }
