package manzano.pag25;

import java.util.Scanner;

public class J {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        float price = input.nextFloat();
        System.out.print("Digite quantos dólares você quer converter: ");
        float dollars = input.nextFloat();
        input.close();

        float reais = dollars * price;

        System.out.printf("Você tem R$%.2f\n", reais);
    }
}