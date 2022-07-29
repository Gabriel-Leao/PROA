package manzano.pag66;

import java.util.Scanner;

public class H {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base da potência: ");
        int base = input.nextInt();
        System.out.print("Digite o exponente da potência: ");
        int expoente = input.nextInt();
        input.close();

        int potencia = 1;

        for (int i = 1; i <= expoente; i++) {
            potencia = potencia * base;
        }

        System.out.printf("%d ^ %d = %d.\n", base, expoente, potencia);
    }
}