public class NumerosImpares {
    public static void main(String[] args) {

        int produto=1;

        for(int i=0; i <= 15; i++) {
            if(i % 2 != 0) {
                produto = i*produto;
                System.out.printf("\n%d", produto);
            }
        }
        System.out.printf("\nRESULTADO: %d", produto);
    }
}
