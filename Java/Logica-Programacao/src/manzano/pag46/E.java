package manzano.pag46;

public class E {

    public static void main(String[] args) {
        int expoente = 0;
        int base = 3;

        while (expoente <= 15) {
            int i = 1;
            int potencia = 1;

            while (i <= expoente) {
                potencia = potencia * base;
                i++;
            }

            System.out.printf("%d ^ %d = %d\n", base, expoente, potencia);
            expoente++;
        }
    }
}