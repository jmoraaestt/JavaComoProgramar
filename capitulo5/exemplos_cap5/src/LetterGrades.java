// Figura 5.9: LetterGrades.java
// A classe LetterGrades utiliza a instrução switch paraa contar as letras das notas escolares.
import java.util.Scanner;

public class LetterGrades {
    public static void main(String[] args) {
        int total = 0; // Soma das notas
        int gradeCounter = 0; // Número de notas inseridas
        int aCount = 0; // Contagem de notas A
        int bCount = 0; // Contagem de notas B
        int cCount = 0; // Contagem de notas C
        int dCount = 0; // Contagem de notas D
        int fCount = 0; // Contagem de notas F

        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n     %s%n    %s%n", "Enter the integer grades in the range 0-100. ",
                "Type the end-of file indicator to terminate input: ", "On UNIX/LINUX/MAC OS X type <Ctrl> d then press Enter",
                "On WINDOWS type <Ctrl> z then press Enter");

        // Faz o loop até o usuário inserir o indicador de fim de arquivo
        while (input.hasNext()) {
            int grade = input.nextInt(); // Lê a nota
            total += grade; // Adiciona nota a total
            ++gradeCounter; // Incrementa o número de notas

            // Incrementa o contador de letras de nota adequado
            switch (grade/10) {
                case 9: // A nota estava entre 90
                case 10: // e 100, inclusivo
                    ++aCount;
                    break; // sai do switch

                case 8: // A nota estava entre 80 e 89
                    ++bCount;
                    break; // Sai do switch

                case 7: // nota estava entre 70 e 79
                    ++cCount;
                    break; // sai do switch

                case 6: // nota estava entre 60 e 69
                    ++dCount;
                    break; // sai do switch

                default: // menor que 60
                ++fCount;
                break; // opcional; fecha o switch de qualquer maneira

            }

            // Exibe o relatório da nota
            System.out.printf("%nGrade Report: %n");

            // Se o usuário inseriu pelo menos uma nota...
            if(gradeCounter != 0) {
                // Calcula a média de todas as notas inseridas
                double average = (double) total / gradeCounter;

                // Gera a saida de resumo dos resultados
                System.out.printf("Total of the %d grades entered is: %d%n", gradeCounter, total);
                System.out.printf("Class average is: %.2f%n", average);
                System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                        "Number of students who received each grade:",
                        "A: ", aCount,   // exibe número de notas A
                        "B: ", bCount,   // exibe número de notas B
                        "C: ", cCount,   // exibe número de notas C
                        "D: ", dCount,   // exibe número de notas D
                        "F: ", fCount); // exibe número de notas F

            }
            else {
                System.out.println("No grades were entered");
            }
        }
    }

}
