package manzano.pag25;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em C°: ");
        short c = input.nextShort();
        input.close();

        int f = (9 * c + 160) / 5;

        System.out.printf("A temperatura em celsius C°%d convertida para Fahrenheit é F°%d.\n", c, f);
    }
}