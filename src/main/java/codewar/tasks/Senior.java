package codewar.tasks;

public class Senior {

    public static void main(String[] args) {
        int x = 0;
        int[] nums = {1, 2, 3};
        for (x = 0; x < nums.length; x++ ) {
            x += nums[x];
        }
        System.out.println(x);
    }

    public void bar() {
        int x = 0;
        int[] nums = {1, 2, 3};
        for (x = 0; x < nums.length; x++ ) {
            x += nums[x];
        }
        System.out.println(x);
    }
}
