package faccat;

import java.util.Scanner;

public class Ex030 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número inteiro: ");
        short n1 = sc.nextShort();
        System.out.print("Digite o 2° número inteiro: ");
        short n2 = sc.nextShort();
        System.out.print("Digite o 3° número inteiro: ");
        short n3 = sc.nextShort();
        sc.close();

        if (n1 <= n2 && n2 <= n3) {
            System.out.printf("Os números em ordem crescente é %d, %d, %d.\n", n1, n2, n3);
        } else if (n1 <= n3 && n3 <= n2) {
            System.out.printf("Os números em ordem crescente é %d, %d, %d.\n", n1, n3, n2);
        } else if (n2 <= n3 && n1<= n3) {
            System.out.printf("Os números em ordem crescente é %d, %d, %d.\n", n2, n1, n3);
        } else if (n2 <= n3) {
            System.out.printf("Os números em ordem crescente é %d, %d, %d.\n", n2, n3, n1);
        } else if (n1 <= n2) {
            System.out.printf("Os números em ordem crescente é %d, %d, %d.\n", n3, n1, n2);
        } else System.out.printf("Os números em ordem crescente é %d, %d, %d.\n", n3, n2, n1);
    }
}