package manzano.pag25;

import java.util.Scanner;

public class K {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        float price = input.nextFloat();
        System.out.print("Digite quantos reais você quer converter: ");
        float reais = input.nextFloat();
        input.close();

        float dollars = reais / price;

        System.out.printf("Você tem R$%.2f\n", dollars);
    }
}
