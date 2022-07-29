package funcoes;

import java.util.Scanner;

public class Metodo01 {
    public static int soma(int parcela1, int parcela2) {
        return parcela1 + parcela2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n1 = input.nextInt();
        System.out.print("Digite um número inteiro: ");
        int n2 = input.nextInt();
        input.close();

        System.out.println(soma(n1, n2));
    }
}