package manzano.pag46;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int number = input.nextInt();
        input.close();

        int i = 1;
        while (i <= 10) {
            System.out.printf("%d X %d = %d\n", number, i, number * i);
            i++;
        }
    }
}