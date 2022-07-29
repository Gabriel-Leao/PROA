package manzano.pag25;

import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tempo de viagem: ");
        int tempo = input.nextInt();
        System.out.print("Digite a velocidade média: ");
        int velocidade = input.nextInt();
        input.close();

        int distancia = tempo * velocidade;
        int litrosUsados = distancia / 12;

        System.out.printf("A viagem durou %dH com a velocidade média de %dKM/H. Ao todo foi percorrido %dKM e foi " +
                        "gasto %dL de combustível.\n", tempo,
                velocidade, distancia, litrosUsados);
    }
}