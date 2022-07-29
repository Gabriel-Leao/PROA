package manzano.pag41;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int b = input.nextInt();
        input.close();

        System.out.printf("A diferença entre o maior número e o menor é de %d.\n", (Math.max(a, b)) - Math.min(a, b));
    }
}