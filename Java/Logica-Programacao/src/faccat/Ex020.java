package faccat;

import java.util.Scanner;

public class Ex020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        short n1 = sc.nextShort();
        System.out.print("Digite o 2° número: ");
        short n2 = sc.nextShort();
        sc.close();

        if (n1 > n2) {
            System.out.printf("Os números organizados em ordem crescente: %d, %d\n", n2, n1);
        } else System.out.printf("Os números organizados em ordem crescente: %d, %d\n", n1, n2);
    }
}