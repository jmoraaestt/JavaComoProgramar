public class Fatoriais {
    public static void main(String[] args) {

        long fatorial=1;

        for(int i=1; i < 20; i++) {
            for(int j=0; j < 20; j ++) {
                fatorial = i * i-1;
            }
            System.out.printf("\n%d", fatorial);
        }

        }

    }