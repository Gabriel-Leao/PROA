package manzano.pag46;

import java.util.Scanner;

public class L {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;
        int maior = -99999;
        int menor = 99999;

        System.out.println("Digite um número negativo para interromper");
        System.out.println("==========================================");

        while (number >= 0) {
            System.out.print("Digite um número inteiro: ");
            number = input.nextInt();
            if (number >= maior) maior = number;
            if (number >= 0) if (number <= menor) menor = number;
        }

        input.close();

        System.out.printf("\nO maior número digitado foi %d e o menor foi %d.\n", maior, menor);
    }
}