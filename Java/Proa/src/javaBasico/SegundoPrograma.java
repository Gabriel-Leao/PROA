package javaBasico;

import java.util.Scanner;

public class SegundoPrograma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int number = input.nextInt();
        input.close();

        System.out.printf("O número digitado foi: %d.\n", number);
    }
}