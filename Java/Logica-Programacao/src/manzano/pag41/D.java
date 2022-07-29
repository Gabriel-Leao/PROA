package manzano.pag41;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a nota do 1° bimestre: ");
        float n1 = input.nextFloat();
        System.out.print("Digite a nota do 2° bimestre: ");
        float n2 = input.nextFloat();
        System.out.print("Digite a nota do 3° bimestre: ");
        float n3 = input.nextFloat();
        System.out.print("Digite a nota do 4° bimestre: ");
        float n4 = input.nextFloat();

        float media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.printf("Com a média de %.1f o aluno foi aprovado!\n", media);
        } else {
            System.out.print("Digite a nota do exame: ");
            float exame = input.nextFloat();
            input.close();
            media = (media + exame) / 2;

            if (media >= 5) {
                System.out.printf("Com %.1f de média o aluno foi aprovado em exame!\n", media);
            } else System.out.printf("Com %.1f de média o aluno foi reprovado em exame!\n", media);
        }
    }
}