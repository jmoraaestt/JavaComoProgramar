import java.util.Scanner;

public class FormatoTabela {
    public static void main(String args[]) {

        // Variáveis
        int cont = 0;

        System.out.print("N     10*N    100*N    1000*N\n");

        while(cont < 5) {
            cont +=1;
            System.out.printf("%d       %d      %d      %d\n", cont, cont*10, cont*100, cont*1000);
        }
    }
}
