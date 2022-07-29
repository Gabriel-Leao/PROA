package faccat;

import java.util.Scanner;

public class Ex019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        short n1 = sc.nextShort();
        System.out.print("Digite o 2° número: ");
        short n2 = sc.nextShort();
        sc.close();

        short maior;

        if (n1 > n2) {
            maior = n1;
        } else maior = n2;

        System.out.printf("O maior número digitado foi %d\n", maior);
    }
}