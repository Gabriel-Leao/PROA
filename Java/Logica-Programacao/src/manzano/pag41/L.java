package manzano.pag41;

import java.util.Scanner;

public class L {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = input.nextLine();
        System.out.print("Digite o seu sexo [M/F]: ");
        char sex = input.nextLine().charAt(0);
        input.close();

        if (sex == 'M' || sex == 'm') {
            System.out.printf("Olá Sr. %s.\n", name);
        } else if (sex == 'F' || sex == 'f') {
            System.out.printf("Olá Sra. %s.\n", name);
        } else System.out.printf("Olá %s.\n", name);
    }
}