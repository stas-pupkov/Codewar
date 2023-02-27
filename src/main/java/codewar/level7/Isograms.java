package codewar.level7;

public class Isograms {

    public static void main(String[] args) {
        System.out.println(isIsogram2("moOse"));
    }

    public static boolean isIsogram(String str) {
        String workWord = str.toLowerCase();
        return workWord.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .filter(s -> workWord.indexOf(s) == workWord.lastIndexOf(s))
                .count() == str.length();
    }

    public static boolean isIsogram2(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }

}
