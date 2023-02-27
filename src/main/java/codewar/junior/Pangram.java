package codewar.junior;

public class Pangram {

    public static void main(String[] args) {
        System.out.printf(String.valueOf(check2("asDf")));
    }

    public static boolean check(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        boolean pangram = true;
        for (int i = 0; i < 26; i++) {
            if (!sentence.toLowerCase().contains(alphabet.substring(i, i + 1))) {
                pangram = false;
                break;
            }
        }
        return pangram;
    }

    public static boolean check2(String sentence) {
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }

}
