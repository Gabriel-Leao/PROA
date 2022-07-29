package faccat;

import java.util.Scanner;

public class Ex029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1° número inteiro: ");
        short n1 = sc.nextShort();
        System.out.print("Digite o 2° número inteiro: ");
        short n2 = sc.nextShort();
        System.out.print("Digite o 3° número inteiro: ");
        short n3 = sc.nextShort();
        sc.close();

        int soma;

        if (n1 >= n2 && n2 >= n3) {
            soma = n1 + n2;
        } else if (n2 >= n3 && n3>= n1) {
            soma = n2 + n3;
        } else soma = n1 + n3;

        System.out.printf("A soma dos dois maiores números é %d.\n", soma);
    }
}