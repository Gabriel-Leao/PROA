package manzano.pag50;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int soma = 0;
        int numerosLidos = 0;

        System.out.println("Digite um número negativo para interromper");
        System.out.println("==========================================");

        do {
            System.out.print("Digite um número inteiro: ");
            number = input.nextInt();
            if (number >= 0) {
                numerosLidos++;
                soma += number;
            }
        } while (number >= 0);
        input.close();

        float media = (float) soma / numerosLidos;

        System.out.println("==========================================");
        System.out.printf("""
                Ao todo foram lidos %d números, o somatório desses números é igual a %d e a média aritmética é de %.2f.
                """, numerosLidos, soma, media);
    }
}