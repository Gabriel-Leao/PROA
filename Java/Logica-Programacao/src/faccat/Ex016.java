package faccat;

import java.util.Scanner;

public class Ex016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de maçãs compradas: ");
        short qtyApples = sc.nextShort();
        sc.close();

        float applesPrice;

        if (qtyApples >= 12) {
            applesPrice = 1.00F;
        } else applesPrice = (float) 1.30;

        float totalPrice = applesPrice * qtyApples;

        System.out.printf("O preço total da compra é R$%.2f\n", totalPrice);
    }
}