package codewar.level6;

public class PersistentBugger {

    public static void main(String[] args) {
        System.out.println(persistence(4));
    }

    public static int persistence(long n) {
        return recurs(n, 0);
    }

    private static int recurs(long n, int counter) {
        if (n < 10) return counter;

        int product = 1;
        while (n != 0) {
            product = (int) (product * (n % 10));
            n = n / 10;
        }
        counter++;
        return recurs(product, counter);
    }

}
