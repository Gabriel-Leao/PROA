package faccat.calculadora;

import java.util.Scanner;

public class Divisao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dividendo: ");
        short n1 = sc.nextShort();
        System.out.print("Digite o divisor: ");
        short n2 = sc.nextShort();
        sc.close();

        System.out.println("O quociente da divisão é: " + (n1 / n2));
    }
}
