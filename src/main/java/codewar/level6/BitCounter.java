package codewar.level6;

public class BitCounter {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
    }

    public static int countBits(int n){
        return (int) Integer.toBinaryString(n)
                .chars()
                .map(Character::getNumericValue)
                .filter(i -> i == 1)
                .count();
    }

}
