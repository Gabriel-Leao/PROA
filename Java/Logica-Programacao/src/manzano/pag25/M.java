package manzano.pag25;

import java.util.Scanner;

public class M {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int b = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int c = input.nextInt();
        input.close();

        int soma = a + b + c;

        System.out.printf("O quadrado da soma dos três valores lidos é %.0f.\n", Math.pow(soma, 2));
    }
}