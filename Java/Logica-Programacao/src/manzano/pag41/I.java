package manzano.pag41;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();
        input.close();

        if (number % 2 == 0) {
            System.out.printf("O número %d é par!\n", number);
        } else System.out.printf("O número %d é impar!\n", number);
    }
}