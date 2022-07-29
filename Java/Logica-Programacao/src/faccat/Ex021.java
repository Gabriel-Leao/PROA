package faccat;

import java.util.Scanner;

public class Ex021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o horário inicial da partida: ");
        short horaInicial = sc.nextShort();
        System.out.print("Digite o horário do fim da partida: ");
        short horaFinal = sc.nextShort();
        sc.close();

        int duration = horaFinal - horaInicial;

        if (duration < 0) {
            duration = duration + 24;
        }

        System.out.printf("A partida de xadrez durou %dH\n", duration);
    }
}