import java.util.Scanner;

public class CalculadoraSalarios {
    public static void main(String args[]) {

        // Variáveis
        int i = 0;
        double horas_semanais;
        double salario_hora;
        double salario_semanal;
        double hora_extra=0;

        Scanner input = new Scanner(System.in);

        // Loop com três funcionários
        while(i < 3) {
            i+=1;

            // Recolhendo dados das horas e salário-hora
            System.out.printf("Funcionário %d - Total de horas trabalhadas na semana: \n", i);
            horas_semanais = input.nextFloat();

            System.out.printf("Funcionário %d - Valor do salário-hora: \n", i);
            salario_hora = input.nextFloat();

            if (horas_semanais > 40) {
                double horas_extras = horas_semanais - 40;
                hora_extra = horas_extras * (salario_hora * 0.5); // só os 50% a mais
                salario_semanal = (horas_semanais * salario_hora) + hora_extra;
            } else {
                hora_extra = 0;
                salario_semanal = horas_semanais * salario_hora;
            }

            System.out.print("\n");
            System.out.print("DADOS DOS FUNCIONÁRIOS - ");
            System.out.printf("FUNCIONÁRIO %d\nTotal de horas trabalhadas na semana: %.2f\nValor do salário-hora: %.2f\nSalário: %.2f\nHora extra: %.2f\n",
                    i, horas_semanais, salario_hora, salario_semanal, hora_extra);

        }

    }

}
