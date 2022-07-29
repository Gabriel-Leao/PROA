package manzano.pag41;

import java.util.Scanner;

public class H {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n2 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n3 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n4 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n5 = input.nextInt();
        input.close();

        System.out.printf("O maior número digitado foi %d e o menor foi %d.\n", Math.max(Math.max(Math.max(n1, n2),
                Math.max(n3, n4)), n5), Math.min(Math.min(Math.min(n1, n2), Math.min(n3, n4)), n5));
    }
}