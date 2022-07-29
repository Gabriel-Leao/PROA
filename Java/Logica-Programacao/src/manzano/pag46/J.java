package manzano.pag46;

public class J {

    public static void main(String[] args) {
        int soma = 0;
        int i = 50;

        while (i <= 70) {
            if (i % 2 == 0) {
                soma = soma + i;
            }
            i++;
        }

        int media = soma / 20;

        System.out.printf("A soma dos números pares entre 50 e 70 é %d e a média dos números é igual a %d.\n", soma, media);
    }
}