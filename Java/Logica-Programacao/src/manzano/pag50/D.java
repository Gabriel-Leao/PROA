package manzano.pag50;

public class D {

    public static void main(String[] args) {
        double acumulador = 0;
        double grao = 1;
        int i = 1;

        do {
            acumulador += grao;
            grao = grao * 2;
            i++;
        } while (i <= 64);

        System.out.println(acumulador);
    }
}