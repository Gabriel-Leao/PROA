package faccat;

import java.util.Scanner;

public class Ex015 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        short number = sc.nextShort();
        sc.close();

        if (number >= 0) {
            System.out.printf("O número %d é positivo.\n", number);
        } else System.out.printf("O número %d é negativo.\n", number);
    }
}