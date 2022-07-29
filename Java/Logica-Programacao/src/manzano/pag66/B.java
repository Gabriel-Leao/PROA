package manzano.pag66;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int number = input.nextInt();
        input.close();

        System.out.println("==============");
        System.out.printf("Tabuada do %d.\n", number);
        System.out.println("==============");
        System.out.println("--------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d.\n", number, i, number * i);
        }

        System.out.println("--------------");
    }
}