package faccat;

import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1° nota do aluno: ");
        float nota1 = sc.nextFloat();
        System.out.print("Digite a 2° nota do aluno: ");
        float nota2 = sc.nextFloat();
        sc.close();

        float media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.printf("Com a média de %.1f o aluno é aprovado.\n", media);
        } else System.out.printf("Com a média de %.1f o aluno é reprovado.\n", media);
    }
}