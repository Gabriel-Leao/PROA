package faccat.calculadora;

import java.util.Scanner;

public class Multiplicacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° fator: ");
        short numero1 = sc.nextShort();
        System.out.print("Digite o 2° fator: ");
        short numero2 = sc.nextShort();
        sc.close();

        System.out.println("O produto dos números é: " + (numero1 * numero2));
    }
}