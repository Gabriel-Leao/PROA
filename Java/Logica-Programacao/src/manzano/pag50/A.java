package manzano.pag50;

public class A {

    public static void main(String[] args) {
        int i = 15;

        do {
            System.out.println((int) Math.pow(i, 2));

            i++;
        } while (i <= 200);
    }
}