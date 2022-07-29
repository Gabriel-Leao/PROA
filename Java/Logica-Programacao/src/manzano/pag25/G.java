package manzano.pag25;

import java.util.Scanner;

public class G {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int b = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int c = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int d = input.nextInt();
        input.close();

        System.out.println("\n========= SOMA ========");
        System.out.printf("%d + %d = %d\n", a, b, a + b);
        System.out.printf("%d + %d = %d\n", a, c, a + c);
        System.out.printf("%d + %d = %d\n", a, d, a + d);
        System.out.printf("%d + %d = %d\n", b, c, b + c);
        System.out.printf("%d + %d = %d\n", b, d, b + d);
        System.out.printf("%d + %d = %d\n", c, d, c + d);
        System.out.println("========= SOMA ========");

        System.out.println("\n======= MULTIPLICAÇÃO ======");
        System.out.printf("%d X %d = %d\n", a, b, a * b);
        System.out.printf("%d X %d = %d\n", a, c, a * c);
        System.out.printf("%d X %d = %d\n", a, d, a * d);
        System.out.printf("%d X %d = %d\n", b, c, b * c);
        System.out.printf("%d X %d = %d\n", b, d, b * d);
        System.out.printf("%d X %d = %d\n", c, d, c * d);
        System.out.println("======= MULTIPLICAÇÃO ======");
    }
}