package faccat;

public class Ex039 {

    public static void main(String[] args) {
        boolean A, B, C;

        A = true;
        B = true;
        C = false;

        System.out.printf("1 - (A e B) ou (A xou B) = %b.\n", ((A && B) || (A ^ B)));
        System.out.printf("2 - (A ou B) e (A e B) = %b.\n", (A || B) && (A && C));
        System.out.printf("3 - (A ou C e B) xou (A e não B) = %b.\n", (A || C && B) ^ (A && ! B));
    }
}