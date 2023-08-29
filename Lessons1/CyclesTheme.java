package Lessons1;

public class CyclesTheme {
    public CyclesTheme() {
    }

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int x = -10;
        int y = 21;
        int eventSum = 0;
        int oddSum = 0;
        int number = x;

        do {
            if (number % 2 == 0) {
                eventSum += number;
            } else {
                oddSum += number;
            }

            ++number;
        } while(number <= y);

        System.out.println("На отрезке  x  y  сумма четных чисел = " + eventSum + ", а не четных " + oddSum);
        System.out.println("2. Вывод чисел в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int numb;
        if (c < b && c < a && b < a && b > c) {
            int min = c;

            for(numb = a; numb >= min; --numb) {
                System.out.println(numb);
            }
        }

        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        numb = 1234;
        int reversNumber = 0;

        int sumOfDigits;
        int count;
        for(sumOfDigits = 0; numb > 0; numb /= 10) {
            count = numb % 10;
            reversNumber = reversNumber * 10 + count;
            sumOfDigits += count;
        }

        System.out.println("Число в обратном порядке " + reversNumber);
        System.out.println("Сумма цифр число" + sumOfDigits);
        System.out.println("4. Вывод чисел в несколько строк");
        count = 0;
        int maxColumns = 5;
        int maxRows = 23 / maxColumns;
        int extraDigits = maxColumns - 23 % maxColumns;

        int number1;
        for(number1 = 1; number1 < 24; number1 += 2) {
            System.out.printf("%5d", number1);
            ++count;
            if (count % maxColumns == 0) {
                System.out.println();
            }
        }

        for(number1 = 0; number1 < extraDigits; ++number1) {
            System.out.print(" 0");
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        number1 = 3242592;

        int count1;
        for(count1 = 0; number1 > 0; number1 /= 10) {
            int digit = number1 % 10;
            if (digit == 2) {
                ++count1;
            }
        }

        System.out.println("Количество вхождений числа 2: " + count1);
        if (count1 % 2 == 0) {
            System.out.println("Получившееся значение четное");
        } else {
            System.out.println("Получившееся значение нечетное");
        }

        System.out.println("6. Отображение геометрических фигур");
        int width = 5;
        int height = 3;

        int row;
        for(int i = 0; i < height; ++i) {
            for(row = 0; row < width; ++row) {
                System.out.print("*");
            }

            System.out.println();
        }

        int height2 = 5;

        for(row = 1; row <= height2; ++row) {
            for(int col2 = 1; col2 <= row; ++col2) {
                System.out.print("#");
            }

            System.out.println();
        }

        int height3 = 5;
        int row3 = 1;

        do {
            int col3 = 1;

            do {
                System.out.print("&");
                ++col3;
            } while(col3 <= row3);

            System.out.println();
            ++row3;
        } while(row <= height3);

    }
}

