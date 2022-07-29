package faccat;

import java.util.Scanner;

public class Ex005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        short numero = sc.nextShort();
        sc.close();

        System.out.println("O antecessor do número digitado é: " + (numero - 1));
    }
}