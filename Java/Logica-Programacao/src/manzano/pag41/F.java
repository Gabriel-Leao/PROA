package manzano.pag41;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();
        input.close();

        if (a <= b && b <= c) {
            System.out.printf("%d, %d, %d.\n", a, b, c);
        } else if (a <= c && c <= b) {
            System.out.printf("%d, %d, %d.\n", a, c, b);
        } else if (b <= a && a <= c) {
            System.out.printf("%d, %d, %d.\n", b, a, c);
        } else if (b <= c) {
            System.out.printf("%d, %d, %d.\n", b, c, a);
        } else if (a <= b) {
            System.out.printf("%d, %d, %d.\n", c, a, b);
        } else System.out.printf("%d, %d, %d.\n", c, b, a);
    }
}