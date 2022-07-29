package manzano.pag25;

import java.util.Scanner;

public class H {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o comprimento da caixa: ");
        float comprimento = input.nextFloat();
        System.out.print("Digite a largura da caixa: ");
        float largura = input.nextFloat();
        System.out.print("Digite a altura da caixa: ");
        float altura = input.nextFloat();
        input.close();

        float volume = comprimento * largura * altura;

        System.out.printf("O volume da caixa é de %.0fcm³\n", volume);
    }
}