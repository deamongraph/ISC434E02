package ISC434E02;

public class Math {

    public int perimeterOfSquare(int n) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result += 1;
        }
        return result;
    }

    public int twoSumsOfN(int n, int l, int r) {
        int result = 0;

        for (int a = l; a <= r; a++) {
            for (int b = a + 1; b <= r; b++) {
                if (a + b == n) ++result;
            }
        }
        return result;
    }

    public boolean evenDivide(int n) {
       if (n % 4 == 0) {
        return true;
       }
       return false;
    }
}
