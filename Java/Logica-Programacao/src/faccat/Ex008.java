package faccat;

import java.util.Scanner;

public class Ex008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalVotos = sc.nextInt();
        System.out.print("Digite o total de votos nulos: ");
        int nulos = sc.nextInt();
        System.out.print("Digite o total de votos brancos: ");
        int brancos = sc.nextInt();
        sc.close();
        int votosValidos = totalVotos - (nulos + brancos);

        float pValidos = votosValidos * 100 / totalVotos;
        float pBrancos = brancos * 100 / totalVotos;
        float pNulos = nulos * 100 / totalVotos;

        System.out.println("Ao todo foram " + totalVotos + " eleitores às urnas. \nDesses " + pNulos + "% votaram " +
                "nulo," +
                " " + pBrancos + "% votaram branco e os outros " + pValidos + "% foram votos válidos.");
    }
}