package faccat;

import java.util.Scanner;

public class Ex026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade em estoque: ");
        short qtyEstoque = sc.nextShort();
        System.out.print("Digite a quantidade máxima em estoque: ");
        short qtyMax = sc.nextShort();
        System.out.print("Digite a quantidade mínima em estoque: ");
        short qtyMin = sc.nextShort();
        sc.close();

        int qtyMedia = (qtyMax + qtyMin) / 2;

        if (qtyEstoque >= qtyMedia) {
            System.out.println("Não é necessário a comprar de mais produtos!");
        } else System.out.printf("É necessário a compra de mais %d produtos.\n", (qtyMedia - qtyEstoque));
    }
}