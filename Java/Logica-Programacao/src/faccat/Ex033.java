package faccat;

import java.util.Scanner;

public class Ex033 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite o 2° número: ");
        float n2 = sc.nextFloat();
        sc.close();

        if (n1 == n2) {
            System.out.println("Os números são iguais.");
        } else if (n1 > n2) {
            System.out.println("O primeiro número é maior.");
        } else System.out.println("O segundo número é maior.");
    }
}