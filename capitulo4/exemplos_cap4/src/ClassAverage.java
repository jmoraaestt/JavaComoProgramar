import java.util.Scanner;

public class ClassAverage {
    public static void main(String args[]) {

        // Cria um scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // Fase de inicializações
        int total = 0; // Inicializa a soma das notas inseridas pelo usuário
        int gradeCounter = 0; // Inicializa o número da nota a ser inserido em seguida;

        // Fase de processamento
        // Solicita a entrada e lê a nota do usuário
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        // faz um loop até ler o valor de sentinela inserido pelo usuário
        while (grade != -1) {
            total = total + grade; // adiciona grade a total
            gradeCounter = gradeCounter + 1; // Incrementa o contador por 1;

            // Solicita a entrada e lê a nota do usuário
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        // Fase de término
        // se o usuário inseriu pelo menos uma nota...
        if(gradeCounter != 0) {
            // usa números com ponto decimal para terminar a conta
            double average = (double) total / gradeCounter;
            // exibe o total e a média das notas
            System.out.printf("%nTotal of the %d grades entered in %d%n", gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        else {
            // Nenhuma nota foi inserida
            System.out.println("No grades were entered");
        }
    }
}
