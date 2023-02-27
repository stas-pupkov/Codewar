package codewar.junior;

public class BreakCamelCase {

    public static void main(String[] args) {
//        camelCase("sdfFdfEef");
        System.out.printf("" + camelCase2("sdfFJGFdFDsdffEef"));
    }

    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for (char ch: input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(" ");
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String camelCase2(String input) {
        return input.replaceAll("([A-Z])", " $1");
    }

}
