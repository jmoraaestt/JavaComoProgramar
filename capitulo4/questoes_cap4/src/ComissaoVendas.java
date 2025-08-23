import java.util.Scanner;

// Salário: 200 por semana + 9% de suas vendas brutas.

public class ComissaoVendas {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // Respectivos itens printados na tela
        System.out.print("\n==============");
        System.out.print("\nItem   Value");
        System.out.print("\n1      239.99");
        System.out.print("\n2      129.75");
        System.out.print("\n3      99.95");
        System.out.print("\n4      350.89");
        System.out.print("\n==============");

        // Variáveis - itens
        double item_1 = 239.99;
        double item_2 = 129.75;
        double item_3 = 99.95;
        double item_4 = 350.89;

        int cont_item1 = 0;
        int cont_item2 = 0;
        int cont_item3 = 0;
        int cont_item4 = 0;

        double valor_item1 = 0;
        double valor_item2 = 0;
        double valor_item3 = 0;
        double valor_item4 = 0;

        int resp = 0;
        double salario;

        System.out.print("\n=== VENDAS ===");

        while(resp != -1) {
            System.out.print("\n");
            System.out.print("\nItem vendido ( 1 | 2 | 3 | 4) - Digite -1 caso queira sair: ");
            resp = input.nextInt();

            if(resp == -1) {
                System.out.print("\nSaindo do programa...");
            }
            if(resp == 1) {
                System.out.print("\nQuantidade do item 1 vendido: ");
                cont_item1 = input.nextInt();
                valor_item1 = item_1 * cont_item1;
                System.out.printf("%.2f", valor_item1);
            }
            if(resp == 2) {
                System.out.print("\nQuantidade do item 2 vendido: ");
                cont_item2 = input.nextInt();
                valor_item2 = item_2 * cont_item2;
                System.out.printf("%.2f", valor_item2);
            }
            if(resp == 3) {
                System.out.print("\nQuantidade do item 3 vendido: ");
                cont_item3 = input.nextInt();
                valor_item3 = item_3 * cont_item3;
                System.out.printf("%.2f", valor_item3);
            }
            if(resp == 4) {
                System.out.print("\nQuantidade do item 4 vendido: ");
                cont_item4 = input.nextInt();
                valor_item4 = item_4 * cont_item4;
                System.out.printf("%.2f", valor_item4);
            }
        }
        salario = ((valor_item1 + valor_item2 + valor_item3 + valor_item4)* 0.09) + 200;
        System.out.printf("O salário semanal do funcionário é: %.2f", salario);
    }

}
