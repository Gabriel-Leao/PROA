package manzano.pag46;

public class B {

    public static void main(String[] args) {
        int soma = 0;
        int number = 1;
        
        while (number <= 100) {
            soma = soma + number;
            number++;
        }

        System.out.printf("A soma dos cem primeiros números é %d.\n", soma);
    }
}