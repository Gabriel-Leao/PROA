package manzano.pag26;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de votos no candidato A: ");
        int votosA = input.nextInt();
        System.out.print("Digite a quantidade de votos no candidato B: ");
        int votosB = input.nextInt();
        System.out.print("Digite a quantidade de votos no candidato C: ");
        int votosC = input.nextInt();
        System.out.print("Digite a quantidade de votos nulos: ");
        int votosNulos = input.nextInt();
        System.out.print("Digite a quantidade de votos brancos: ");
        int votosBrancos = input.nextInt();
        input.close();

        int totalVotos = votosA + votosB + votosC + votosNulos + votosBrancos;
        int totalValidos = votosA + votosB + votosC;
        int pVotosValidos = totalValidos * 100 / totalVotos;
        int pVotosA = votosA * 100 / totalValidos;
        int pVotosB = votosB * 100 / totalValidos;
        int pVotosC = votosC * 100 / totalValidos;

        System.out.printf("""
                Ao todo foram %d eleitores.\s
                Desses %d%% foram votos válidos
                Dos votos válidos aproximadamente %d%% foram no candidato A.
                Dos votos válidos aproximadamente %d%% foram no candidato B.
                Dos votos válidos aproximadamente %d%% foram no candidato C.
                """, totalVotos, pVotosValidos, pVotosA, pVotosB, pVotosC);
    }
}