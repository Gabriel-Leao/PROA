package faccat;

import java.util.Scanner;

public class Ex037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade em Kg de maçãs adquiridas: ");
        short macas = sc.nextShort();
        System.out.print("Digite a quantidade em Kg de morangos adquiridas: ");
        short morangos = sc.nextShort();
        sc.close();

        float precoMorangos;
        float precoMacas;
        float precoFinal;

        if (macas > 5) {
            precoMacas = (float) 1.50;
        } else precoMacas = (float) 1.80;

        if (morangos > 5) {
            precoMorangos = (float) 2.20;
        } else precoMorangos = (float) 2.50;

        precoFinal = precoMacas * macas + precoMorangos * morangos;
        if (macas + morangos > 8 || precoFinal > 25) {
            precoFinal = precoFinal - (precoFinal * 10 / 100);
        }

        System.out.printf("O preço total da compra é de R$%.2f.\n", precoFinal);
    }
}