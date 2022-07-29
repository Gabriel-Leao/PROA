package faccat;

import java.util.Scanner;

public class Ex034 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        short x = sc.nextShort();
        System.out.print("Digite o valor de Y: ");
        short y = sc.nextShort();
        sc.close();

        int z = x * y + 5;
        String resposta;

        if (z <= 0) {
            resposta = "A";
        } else if (z <= 100) {
            resposta = "B";
        } else resposta = "C";

        System.out.printf("%d %s", z, resposta);
    }
}