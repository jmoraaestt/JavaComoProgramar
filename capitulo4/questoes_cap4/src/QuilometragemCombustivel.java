import java.util.Scanner;

public class QuilometragemCombustivel {
    // Dados do problema
    //Entrada: quilômetros dirigidos e litros de gasolina consumidos (ambos como int) por viagem.
    // Deve calcular e exibir o consumo em quilometros/litro para cada viagem e imprimir a quilometragem total e a soma
    // total de litros de combustível consumidos até esse ponto para todas as viagens.

    public static void main(String args[]) {

        // Variáveis
        Scanner input = new Scanner(System.in);
        int kmDirigidos, litrosGasolina, result=0;
        float mediaConsumoViagem;
        float kmTotal=0, gasolinaTotal=0;

        // Flag para sair
        System.out.print("Digite -1 para sair ou qualquer outra tecla para continuar: \n");
        result = input.nextInt();

        // Se result for diferente de -1...
            while(result != -1) { // While se torna verdadeiro, de modo que executa o código até ser falso

                System.out.print("Digite a quantidade de quilômetros dirigidos: \n");
                kmDirigidos = input.nextInt();
                kmTotal+=kmDirigidos;

                System.out.print("Digite a quantidade de litros de gasolina consumidos: \n");
                litrosGasolina = input.nextInt();
                gasolinaTotal+=litrosGasolina;

                mediaConsumoViagem = (float) kmDirigidos / litrosGasolina; // coerção
                System.out.printf("Consumo de quilômetros/litro por cada viagem: %.2f\n", mediaConsumoViagem);

                System.out.print("Digite -1 para sair ou qualquer outra tecla para continuar: \n");
                result = input.nextInt();


        }
        System.out.printf("%nQuilometragem total: %.2f", kmTotal);
        System.out.printf("%nCombustível consumido total: %.2f", gasolinaTotal);



    }
}
