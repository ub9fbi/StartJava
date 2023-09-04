package Lessons4;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int maxLenght = scanner.nextInt();

        int[] number = new int[maxLenght];

        System.out.print("Заполните массив целыми числами через пробел: ");

        for (int i = 0; i < maxLenght; i++) {
            number[i] = scanner.nextInt();
        }

        int max = number[0];
        for (int i = 0; i < maxLenght - 1; i++) {
            if (max < number[i + 1]) {
                max = number[i + 1];
            }
        }
        System.out.println("Максимальное число = " + max);
    }
}
