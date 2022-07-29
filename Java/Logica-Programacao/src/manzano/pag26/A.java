package manzano.pag26;

import java.util.Scanner;

public class A {

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

        int produto = a * c;
        int soma = b + d;

        System.out.printf("O resultado do produto do primeiro com o terceiro valor é %d.\n", produto);
        System.out.printf("O resultado da soma do segundo com o quarto valor é de %d.\n", soma);
    }
}