package manzano.pag66;

public class C {

    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.printf("O total da soma dos cem primeiros números é %d.\n", soma);
    }
}