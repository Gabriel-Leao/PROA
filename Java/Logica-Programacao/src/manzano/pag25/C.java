package manzano.pag25;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio da lata: ");
        float raio = input.nextFloat();
        System.out.print("Digite a altura da lata: ");
        float altura = input.nextFloat();
        input.close();

        float volume = (float) (Math.PI * Math.pow(raio, 2) * altura);

        System.out.printf("O volume da lata de óleo é de %.0f.cm³\n", volume);
    }
}