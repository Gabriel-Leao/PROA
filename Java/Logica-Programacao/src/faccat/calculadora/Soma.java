package faccat.calculadora;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1° parcela: ");
        short numero1 = sc.nextShort();
        System.out.print("Digite a 2° parcela: ");
        short numero2 = sc.nextShort();
        sc.close();

        System.out.println("A soma dos números é: " + (numero1 + numero2));
    }
}