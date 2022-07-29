package manzano.pag46;

public class C {

    public static void main(String[] args) {
        int somaPares = 0;
        int number = 1;

        while (number <= 500) {
            if (number % 2 == 0) somaPares = somaPares + number;
            number++;
        }

        System.out.printf("A soma dos números pares entre 1 e 500 é %d.\n", somaPares);
    }
}