package faccat;

import java.util.Scanner;

public class Ex013 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Digite a 1° nota do aluno: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite a 2° nota do aluno: ");
        float n2 = sc.nextFloat();
        System.out.print("Digite a 3° nota do aluno: ");
        float n3 = sc.nextFloat();
        sc.close();

        float media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;

        System.out.printf("A média do aluno é de: %.1f\n", media);
    }
}