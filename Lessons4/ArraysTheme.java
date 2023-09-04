package Lessons4;

public class ArraysTheme {
    public static void main(String[] args) {
        int[] numbs = {1, 7, 4, 5, 2, 6, 3};

        for (int i = 0; i < numbs.length; i++) {
            numbs[0] = 3;
            numbs[1] = 6;
            numbs[2] = 2;
            numbs[4] = 4;
            numbs[5] = 7;
            numbs[6] = 1;
            System.out.print(numbs[i] + " ");
        }
    }
}
