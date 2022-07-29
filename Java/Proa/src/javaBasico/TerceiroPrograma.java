package javaBasico;

import java.util.Scanner;

public class TerceiroPrograma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        input.close();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é par!\n", numero);
        } else System.out.printf("O número %d é impar!\n", numero);
    }
}