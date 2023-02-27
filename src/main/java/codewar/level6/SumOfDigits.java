package codewar.level6;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(digit(119));
        System.out.println(digitalRoot(119));
    }

    public static int digitalRoot(int n) {
        if (n < 10) return n;

        int sum = String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();

        return digitalRoot(sum);
    }

    public static int digit(int n) {
        if (n < 10) return n;
        int result = n % 10 + digit(n/10);
        return digit(result);
    }

}
