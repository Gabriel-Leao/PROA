package manzano.pag25;

import java.util.Scanner;

public class F {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int A = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int B = input.nextInt();
        input.close();

        int C = B;
        B = A;
        A = C;
        System.out.printf("%d & %d.\n", A, B);
    }
}