package faccat;

import java.util.Scanner;

public class Ex043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        float a = sc.nextFloat();
        System.out.print("Informe o valor de B: ");
        float b = sc.nextFloat();
        System.out.print("Informe o valor de C: ");
        float c = sc.nextFloat();
        sc.close();

        String mens;

        if (a == b && c == b) {
            mens = "Com essas medidas o triângulo é equilátero.";
        } else if  (a == b || b == c || c == a) {
            mens = "Com essas medidas o triângulo é isósceles.";
        } else if (a + b < c || a + c < b || b + c < a) {
            mens = "Com essas medidas é impossível formar um triângulo.";
        } else mens = "Com essas medidas o triângulo é escaleno." ;

        System.out.println(mens);
    }
}