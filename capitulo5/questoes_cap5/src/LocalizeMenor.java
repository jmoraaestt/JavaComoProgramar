import java.util.Scanner;

public class LocalizeMenor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis
        int values;
        int number;
        int menor;

        System.out.print("How many values do you want? ");
        values = input.nextInt();

        System.out.print("Number: ");
        menor = input.nextInt();

        for(int i=1; i < values; i++) {
            System.out.print("Number: ");
            number = input.nextInt();

            if(menor > number) {
                menor = number;
            }
        }
        System.out.printf("\nMenor numero: %d", menor);
    }
}
