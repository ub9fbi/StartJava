package Lessons4;

import java.util.Random;
import java.util.Scanner;

public class ArraysTheme {
    private int[] sumNumbs;
    public static void main(String[] args) {
        // реверс значений массива
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
        System.out.println("\n");

        // произведение элементов массива
        Random random = new Random();
        int[] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int R = numbers[0] * numbers[1] * numbers[2] * numbers[3] * numbers[4] * numbers[5] *
                    numbers[6] * numbers[7] * numbers[8];
        System.out.print(numbers[0] + " * " + numbers[1] + " * " + numbers[2] + " * " + numbers[3]
                    + " * " + numbers[4] + " * " + numbers[5] + " * " +
                numbers[6] + " * " + numbers[7] + " * " + numbers[8] + " = " + R);
        System.out.println("\n");

        // Удаление элементов массива

        double[] delArrayElement = new double[15];

        for (int i = 0; i < delArrayElement.length; i++) {
            delArrayElement[i] = random.nextDouble();
        }
        int avereg = delArrayElement.length/2;
        System.out.println("Средний индекс массива: " + avereg + "\nего значение: " + delArrayElement[avereg]);

        for (int i = 0; i < delArrayElement.length; i++) {

        }
    }
}




