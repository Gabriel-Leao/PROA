package faccat;

import java.util.Scanner;

public class Ex014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        short n1 = sc.nextShort();
        sc.close();

        if (n1 > 10) {
            System.out.printf("O número %d é maior que 10.\n", n1);
        } else if (n1 == 10) {
            System.out.printf("O número %d é igual a 10.\n", n1);
        } else System.out.printf("O número %d é menor que 10.\n", n1);
    }
}