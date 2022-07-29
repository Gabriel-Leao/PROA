package manzano.pag46;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a base da potência: ");
        int base = input.nextInt();
        System.out.print("Digite o expoente da potência: ");
        int expoente = input.nextInt();
        input.close();

        int i = 1;
        int potencia = 1;

        while (i <= expoente) {
            potencia = potencia * base;
            i++;
        }

        System.out.printf("%d ^ %d = %d\n", base, expoente, potencia);
    }
}