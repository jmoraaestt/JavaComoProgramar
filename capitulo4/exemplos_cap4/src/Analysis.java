import java.util.Scanner;

public class Analysis {
    public static void main(String args[]) {
        // Cria Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        // Inicializando variáveis nas declarações
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;
        
        // Processa 10 alunos utilizando o loop controlado por contador
        while (studentCounter <= 10) {
            // Solicita ao usuário uma entrada e obtém valores fornecidos pelo usuário
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            // if...else está aninhado na instrução while
            if (result == 1) {
                passes = passes + 1;
            } else {
                failures = failures + 1;
            }

            // Incremento
            studentCounter = studentCounter+1;
        }
         // Fase de término; prepara e exibe os resultados
         System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

        // Determina se mais de oito alunos foram aprovados
        if (passes > 8) {
            System.out.println("Bonus to instructor!");
        }
        }
    }

