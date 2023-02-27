package codewar.level6;

public class WhoLikesThis {

    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jacob", "Alex"));
    }

    public static String whoLikesIt(String... names) {
        int count = names.length;
        if (count == 0) return "no one likes this";
        if (count == 1) return names[0] + " likes this";
        if (count == 2) return names[0] + " and " + names[1] + " like this";
        if (count == 3) return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        if (count > 3) return names[0] + ", " + names[1] + " and " + (count - 2) + " others like this";
        return "";
    }

    public static String whoLikesIt2(String... names) {
        switch (names.length) {
            case 0: return "no one likes this";
            case 1: return String.format("%s likes this", names[0]);
            case 2: return String.format("%s and %s like this", names[0], names[1]);
            case 3: return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
            default: return String.format("%s, %s and %d others like this", names[0], names[1], names.length - 2);
        }
    }

}
