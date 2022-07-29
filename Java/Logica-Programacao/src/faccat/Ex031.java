package faccat;

import java.util.Scanner;

public class Ex031 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o cumprimento do 1° lado do triângulo: ");
        float n1 = sc.nextFloat();
        System.out.print("Digite o cumprimento do 2° lado do triângulo: ");
        float n2 = sc.nextFloat();
        System.out.print("Digite o cumprimento do 3° lado do triângulo: ");
        float n3 = sc.nextFloat();
        sc.close();

        if (n1 == n2 && n3 == n2) {
            System.out.println("Com essas medidas o triângulo é equilátero.");
        } else if (n1 == n2 || n2 == n3 || n3 == n1) {
            System.out.println("Com essas medidas o triângulo é isósceles.");
        } else if (n1 + n2 < n3 || n1 + n3 < n2 || n2 + n3 < n1) {
            System.out.println("Com essas medidas é impossível formar um triângulo.");
        } else System.out.println("Com essas medidas o triângulo é escaleno.");
    }
}