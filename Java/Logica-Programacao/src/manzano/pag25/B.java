package manzano.pag25;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a temperatura em F°: ");
        short f = input.nextShort();
        input.close();

        int c = ((f - 32) * 5) / 9;

        System.out.printf("A temperatura em Fahrenheit F°%d convertida para celsius é C°%d.\n", f, c);
    }
}