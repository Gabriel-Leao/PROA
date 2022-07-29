package faccat;

import java.util.Scanner;

public class Ex042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o código do funcionário: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o ano de nascimento do funcionário: ");
        int aniversario = sc.nextInt();
        System.out.print("Digite o ano de ingresso do funcionário: ");
        int ingresso = sc.nextInt();
        sc.close();

        int idade = 2022 - aniversario;
        int tempTrabalho = 2022 - ingresso;

        if (idade >= 65) {
            System.out.printf("O funcionário de código %d tem %d anos, trabalha na empresa a %d e pode se " +
                    "aposentar", codigo, idade, tempTrabalho);
        } else if (tempTrabalho >= 30) {
            System.out.printf("O funcionário de código %d tem %d anos, trabalha na empresa a %d e pode se " +
                    "aposentar", codigo, idade, tempTrabalho);
        } else if (idade >= 60 && tempTrabalho >= 25) {
            System.out.printf("O funcionário de código %d tem %d anos, trabalha na empresa a %d e pode se " +
                    "aposentar", codigo, idade, tempTrabalho);
        } else System.out.printf("O funcionário de código %d tem %d anos, trabalha na empresa a %d e não pode se " +
                "aposentar", codigo, idade, tempTrabalho);
    }
}