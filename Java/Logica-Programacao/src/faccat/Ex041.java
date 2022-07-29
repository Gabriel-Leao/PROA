package faccat;

import java.util.Scanner;

public class Ex041 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a 1° nota do aluno: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite a 2° nota do aluno: ");
        float n2 = sc.nextFloat();
        System.out.print("Digite a 3° nota do aluno: ");
        float n3 = sc.nextFloat();
        System.out.print("Digite a média dos exercícios: ");
        float mediaEx = sc.nextFloat();
        sc.close();

        float aproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaEx) / 7;
        char notaFinal;

        if (aproveitamento >= 9) {
            notaFinal = 'A';
        } else if (aproveitamento >= 7.5) {
            notaFinal = 'B';
        } else if (aproveitamento >= 6) {
            notaFinal = 'C';
        } else notaFinal = 'D';

        System.out.printf("A nota final do aluno é %c!\n", notaFinal);
    }
}