package manzano.pag41;

import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = input.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = input.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = input.nextInt();
        input.close();

        double delta;
        double x1;

        if (a > 0 && b > 0 && c > 0) {
            delta =  Math.pow(b, 2) - 4 * a * c;
            System.out.printf("O delta é de %.2f\n", delta);
            double x = (-b + Math.sqrt(delta)) / (2 * a);
            if (delta == 0) {
                System.out.printf("O valor de X' é %f.\n", x);
            } else if (delta < 0) {
                System.out.println("Não existem raízes reais");
            } else {
                x1 = ((-b  - Math.sqrt(delta)) / (2 * a));
                System.out.printf("O valor de X' é %f.\n", x);
                System.out.printf("O valor de X'' é %f.\n", x1);
            }
        } else System.out.println("Não é possível calcular o delta");
    }
}