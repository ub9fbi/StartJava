package Lessons4;

public class ArrayMain {
    public static void main(String[] args) {
        int[] numbers = new int[6];

        float[] numbers1 = new float[]{5.1f, .5f, 200.5f};

        for (float number : numbers1) {
            System.out.print(number + " ");
        }

        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = i * 10;
        }
        for (float number : numbers1) {
            System.out.print(number + " ");
        }

        String[] text = new String[3];

        for (String string : text) {
            System.out.println(string);
        }
    }
}