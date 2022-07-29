package faccat;

import java.util.Scanner;

public class Ex032 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do time da casa: ");
        String timeCasa = sc.nextLine();
        System.out.print("Digite o nome do time visitante: ");
        String timeVisitante = sc.nextLine();
        System.out.print("Digite quantos gols o time da casa fez: ");
        short golsCasa = sc.nextShort();
        System.out.print("Digite quantos gols o time visitante fez: ");
        short golsVisitante = sc.nextShort();
        sc.close();

        if (golsCasa > golsVisitante) {
            System.out.printf("O %S venceu o jogo por %d X %d.\n", timeCasa, golsCasa, golsVisitante);
        } else if (golsVisitante > golsCasa) {
            System.out.printf("O %S venceu o jogo por %d X %d.\n", timeVisitante, golsVisitante, golsCasa);
        } else System.out.printf("O jogo empatou por %S %d X %d %S.\n", timeCasa, golsCasa, golsVisitante, timeVisitante);
    }
}