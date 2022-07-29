package faccat;

import java.util.Scanner;

public class Ex040 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String name = sc.nextLine();
        System.out.print("Digite a quantidade adquirida: ");
        short qty = sc.nextShort();
        System.out.print("Digite o preço unitário: ");
        float price = sc.nextFloat();
        sc.close();

        float total = qty * price;

        if (qty <= 5) {
            total = total - total * 2 / 100;
        } else if (qty <= 10) {
            total = total - total * 3 / 100;
        } else total = total - total * 5 / 100;

        System.out.printf("O total a pagar da compra do produto %s é R$%.2f.\n", name, total);
    }
}