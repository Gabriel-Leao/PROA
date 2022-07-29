package manzano.pag66;

public class I {

    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int t3;

        for (int i = 1; i <= 16; i++) {
            System.out.println(t1);

            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
    }
}