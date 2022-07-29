package manzano.pag46;

public class H {

    public static void main(String[] args) {
        int c = 10;

        while (c <= 100) {
            int f = (9 * c + 160) / 5;

            System.out.printf("A temperatura C°%d é F°%d\n", c, f);

            c+= 10;
        }
    }
}