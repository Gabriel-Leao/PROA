package faccat;

import java.util.Scanner;

public class Ex028 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int n1  = sc.nextInt();
        System.out.print("Digite o 2° número: ");
        int n2  = sc.nextInt();
        System.out.print("Digite o 3° número: ");
        int n3  = sc.nextInt();
        sc.close();

        int maior;

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n3 >= n1 && n3 >= n2) {
            maior = n3;
        } else maior = n2;

        System.out.printf("O maior número digitado foi %d.\n", maior);
    }
}