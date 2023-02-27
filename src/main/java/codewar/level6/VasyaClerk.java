package codewar.level6;

public class VasyaClerk {

    public static void main(String[] args) {
        System.out.println(tickets(new int[]{25, 25, 50, 50, 100}));
    }

    public static String tickets(int[] peopleInLine) {
        int charge25 = 0;
        int charge50 = 0;

        for (int i: peopleInLine) {
            if (i == 25) charge25++;
            else if (i == 50) {
                charge25--;
                charge50++;
            }
            else if (i == 100) {
                if (charge50 > 0) {
                    charge50--;
                    charge25--;
                } else {
                    charge25-=3;
                }
            }
            if (charge25 < 0 || charge50 < 0) return "NO";
        }
        return "YES";
    }

}
