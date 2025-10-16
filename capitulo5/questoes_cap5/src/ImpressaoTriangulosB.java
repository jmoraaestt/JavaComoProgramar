public class ImpressaoTriangulosB {
    public static void main(String[] args) {
        for(int i=10; i >= 1; i--) { // Colunas
            for(int j=1; j <= i; j++) { // Linhas -> enquanto j for menor que i, a condição ocorre
                System.out.print( " * ");
            }
            System.out.println(" ");
        }
    }
}
