package manzano.pag50;

import java.util.Scanner;

public class I {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int maior = -99999;
        int menor = 99999;

        System.out.println("Digite um número negativo para interromper");
        System.out.println("==========================================");

        do {
            System.out.print("Digite um número inteiro: ");
            number = input.nextInt();
            if (number >= maior) maior = number;
            if (number <= menor) menor = number;
        } while (number >= 0);

        input.close();

        System.out.printf("\n O maior número digitado foi %d e o menor foi %d.\n", maior, menor);
    }
}