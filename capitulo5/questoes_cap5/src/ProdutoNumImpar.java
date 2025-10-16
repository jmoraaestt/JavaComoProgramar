public class ProdutoNumImpar {
    public static void main (String[] args) {

        double mult=1;
        for(int i=0; i < 15; i++) {
            if(i % 2 != 0) {
                mult = mult * i;
                System.out.printf("\n%.0f", mult);
            }
        }
        System.out.printf("\n%.0f", mult);
    }
}
