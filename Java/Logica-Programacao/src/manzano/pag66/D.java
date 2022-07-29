package manzano.pag66;

public class D {

    public static void main(String[] args) {
        int somaPares = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) somaPares += i;
        }

        System.out.printf("O somatório dos números pares entre 1 e 500 é igual a %d.\n", somaPares);
    }
}