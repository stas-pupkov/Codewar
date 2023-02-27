package codewar.junior;

public class IfSquare {

    public static void main(String[] args) {
        System.out.printf(String.valueOf(isSquare(9567567)));
    }

    public static boolean isSquare(int n) {
        if (n < 0) return false;
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            sum+= 2 * i - 1;
        }
        return sum == n;
    }
}
