package faccat;

import java.util.Scanner;

public class Ex018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento: ");
        short year = sc.nextShort();
        sc.close();

        short age = (short) (2022 - year);

        if (age >= 18) {
            System.out.printf("Com %d anos, o voto é obrigatório.\n", age);
        } else if ( age < 16) {
            System.out.printf("Com %d anos, não pode votar.\n", age);
        } else System.out.printf("Com %d anos, o voto é opcional.\n", age);
    }
}