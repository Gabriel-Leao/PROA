package manzano.pag66;

public class E {

    public static void main(String[] args) {
        int somaImpares = 0;

        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) somaImpares += i;
        }

        System.out.printf("O somatório dos valores ímpares entre 0 e 20 é igual a %d.\n", somaImpares);
    }
}