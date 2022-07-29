package manzano.pag25;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int b = input.nextInt();
        input.close();

        int diferenca = a - b;

        System.out.printf("O quadrado da diferença do 1° número pelo 2° é %d.\n", diferenca * diferenca);
    }
}