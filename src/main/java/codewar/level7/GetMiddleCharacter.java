package codewar.level7;

public class GetMiddleCharacter {

    public static void main(String[] args) {
        System.out.println(getMiddle("tests"));
    }

    //0 < word < 1000
    public static String getMiddle(String word) {
        int length = word.length();
        boolean odd = length % 2 != 0;
        if (odd) {
            return String.valueOf(word.charAt(length/2));
        } else {
            return word.substring(length/2 - 1, length/2 + 1);
        }
    }

}
