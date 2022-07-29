package faccat.calculadora;

import java.util.Scanner;

public class Subtracao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o minuendo: ");
        short n1 = sc.nextShort();
        System.out.print("Digite o subtraendo: ");
        short n2 = sc.nextShort();
        sc.close();

        System.out.println("A diferença entre os dois números é: " + (n1 - n2));
    }
}