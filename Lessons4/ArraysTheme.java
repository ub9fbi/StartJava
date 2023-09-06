package Lessons4;

import java.util.Arrays;
import java.util.Random;

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

        /* Удаление элементов массива */
        double[] delArrayElement = new double[15];
        // заполнение массива
        for (int i = 0; i < delArrayElement.length; i++) {
            delArrayElement[i] = random.nextDouble();
        }
        // средний индекс массива
        int avereg = delArrayElement.length/2;
        System.out.print("Средний индекс массива: " + avereg + "\nЕго значение: " + delArrayElement[avereg] + "\n");

        // заполнение массива 0 если его элементы больше среднего элемента
        for (int i = 0; i < delArrayElement.length; i++) {
            if (delArrayElement[i] > delArrayElement[avereg]) {
                delArrayElement[i] = 0;
            }
        }

        for (double str : delArrayElement) {
            System.out.println(str);
        }
    }
}





