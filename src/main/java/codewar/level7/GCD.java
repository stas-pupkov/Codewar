package codewar.level7;

public class GCD {

    public static void main(String[] args) {
        System.out.println(compute(8, 9));
    }

    public static int compute(int x, int y) {
        return y == 0 ? x : compute(y, x % y);
    }

}
