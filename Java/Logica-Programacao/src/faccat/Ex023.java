package faccat;

import java.util.Scanner;

public class Ex023 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String name = sc.next();
        System.out.print("Digite a sua altura: ");
        float height = sc.nextFloat();
        System.out.print("Digite o seu sexo [M/F]: ");
        String genre = sc.next();
        sc.close();
        float idealWeight;

        if (genre.equals("m") || genre.equals("M")) {
            idealWeight = (float) ((72.7 * height) - 58);
        } else idealWeight = (float) ((62.1 * height) - 44.7);

        System.out.printf("%s, seu peso ideal é de %.0f KG\n", name, idealWeight);
    }
}