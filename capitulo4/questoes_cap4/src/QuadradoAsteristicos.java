import java.util.Scanner;

public class QuadradoAsteristicos {
    public static void main(String args[]) {

        // Variáveis
        int altura=0;
        int largura=0;
        int contAlt=0;
        int contLarg=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a altura: \n");
        altura = input.nextInt();

        System.out.print("Digite a largura: \n");
        largura = input.nextInt();


        while(contAlt < altura) {
          while(contLarg < largura){
              contLarg++;
              System.out.print("* ");
          }
            System.out.print("\n");
          contAlt++;
          contLarg=0;
        }
    }

}

