package faccat;

import java.util.Scanner;

public class Ex010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o custo de fábrica do carro: R$");
        float factoryPrice = sc.nextFloat();
        sc.close();

        float additionDistributor = factoryPrice * 28 / 100;
        float additionTax = factoryPrice * 45 / 100;
        float finalPrice = factoryPrice + additionDistributor + additionTax;

        System.out.println("O preço final do carro é: R$" + finalPrice);
    }
}
