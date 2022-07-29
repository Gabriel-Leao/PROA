package manzano.pag41;

import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();
        input.close();

        if (number < 0) {
            int reverse = number * -1;
            System.out.printf("O número digitado convertido para inteiro é %d.\n",reverse);
        } else System.out.printf("O número digitado foi %d.\n",number);
    }
}