package manzano.pag50;

public class G {

    public static void main(String[] args) {
        int number = 1;

        do {
            if (number % 2 != 0) {
                int f = 1;

                for (int i = 1; i <= number; i++) {
                    f = f * i;
                }

                System.out.printf("%d! = %d\n", number, f);
            }

            number++;
        } while(number <= 10);
    }
}