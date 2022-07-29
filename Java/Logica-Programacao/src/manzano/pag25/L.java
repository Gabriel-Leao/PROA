package manzano.pag25;

import java.util.Scanner;

public class L {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int b = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int c = input.nextInt();
        input.close();

        int somaQuadrados = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

        System.out.printf("A soma dos quadrados dos três valores lidos é %d.\n", somaQuadrados);
    }
}