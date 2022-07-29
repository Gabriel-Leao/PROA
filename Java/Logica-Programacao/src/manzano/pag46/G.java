package manzano.pag46;

public class G {

    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        int t3;
        int i = 1;

        while (i <= 16) {
            System.out.println(t1);

            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            i++;
        }
    }
}