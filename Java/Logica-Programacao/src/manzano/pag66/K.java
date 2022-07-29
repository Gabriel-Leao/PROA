package manzano.pag66;

public class K {

    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number % 2 != 0) {
                int f = 1;

                for (int i = 1; i <= number; i++) {
                    f = f * i;
                }

                System.out.printf("%d! = %d\n", number, f);
            }
        }
    }
}