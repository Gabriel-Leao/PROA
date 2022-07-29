package manzano.pag25;

import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        float valor = input.nextFloat();
        System.out.print("Digite o valor da taxa de juros: ");
        float taxa = input.nextFloat();
        System.out.print("Há quanto anos você tem essa divida: ");
        float tempo = input.nextFloat();
        input.close();

        float divida = valor + (valor * taxa / 100) * tempo;

        System.out.printf("O valor total da dívida é de %.2f.\n", divida);
    }
}