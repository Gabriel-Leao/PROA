package faccat;

import java.util.Scanner;

public class Ex027 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero == 0) {
            System.out.printf("O número %d é igual a 0.", numero);
        } else if (numero > 0) {
            System.out.printf("O número %d é positivo.\n", numero);
        } else System.out.printf("O número %d é negativo.\n", numero);
    }
}