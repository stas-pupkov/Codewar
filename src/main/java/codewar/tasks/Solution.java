package codewar.tasks;

public class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        String substringText = "";

        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        for (char ch: s.toCharArray()) {
            String currentChar = String.valueOf(ch);
            if (substringText.contains(currentChar)) {
                substringText = substringText.substring(substringText.indexOf(currentChar) + 1);
            }
            substringText = substringText + currentChar;
            maxLength = Math.max(substringText.length(), maxLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int max = lengthOfLongestSubstring("pwwkew");
        System.out.println("Max length = " + max);
    }



}
