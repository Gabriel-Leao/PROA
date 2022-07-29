package faccat;

import java.util.Scanner;

public class Ex006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a base do retângulo: ");
        float base = sc.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float altura = sc.nextFloat();
        sc.close();

        float area = base * altura;

        System.out.printf("A área do retângulo é de %.2fcm²", area);
    }
}