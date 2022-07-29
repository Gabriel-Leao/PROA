package faccat;

import java.util.Scanner;

public class Ex035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos litros comprados: ");
        float litros = sc.nextFloat();
        System.out.println("Tipo combustível [A/G]:  ");
        String combustivel = sc.next();
        sc.close();

        float totalPrice;

        if (litros > 20 && combustivel.equalsIgnoreCase("A")) {
            totalPrice = (float) (litros * (2.90 - (2.90 * 5 / 100)));
        } else if (litros < 20 && combustivel.equalsIgnoreCase("A")) {
            totalPrice = (float) (litros * (2.90 - (2.90 * 3 / 100)));
        } else if (litros > 20 && combustivel.equalsIgnoreCase("G")) {
            totalPrice = (float) (litros * (3.30 - (3.30 * 6 / 100)));
        } else totalPrice = (float) (litros * (3.30 - (3.30 * 4 / 100)));

        System.out.printf("O total a pagar é de R$%.2f", totalPrice);
    }
}