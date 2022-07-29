package manzano.pag46;

import java.util.Scanner;

public class K {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char resp = 's';
        String nomeComodo;
        float largura;
        float comprimento;
        float areaTotal = 0;
        float areaComodo;

        while (resp == 'S' || resp == 's') {
            System.out.print("Qual cômodo você quer registrar: ");
            nomeComodo = input.next();
            System.out.printf("Digite a largura da %s: ", nomeComodo);
            largura = input.nextFloat();
            System.out.printf("Digite o comprimento da %s: ", nomeComodo);
            comprimento = input.nextFloat();
            areaComodo = largura * comprimento;
            areaTotal = areaTotal + areaComodo;
            System.out.print("Deseja continuar? [S/N]: ");
            resp = input.next().charAt(0);
        }

        input.close();

        System.out.printf("\nA área total da residência é de %.1fM²\n", areaTotal);
    }
}