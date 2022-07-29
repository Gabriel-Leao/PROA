package manzano.pag50;

public class B {

    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        do {
            if (i % 2 == 0) soma = soma + i;
            i++;
        } while (i <= 500);

        System.out.printf("O somatório dos números pares entre 1 e 500 é igual a %d.\n", soma);
    }
}