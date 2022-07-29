package manzano.pag66;

public class J {

    public static void main(String[] args) {
        for (int c = 10; c <= 100; c += 10) {
            int f = (9 * c + 160) / 5;

            System.out.printf("A temperatura C°%d é F°%d\n", c, f);
        }
    }
}