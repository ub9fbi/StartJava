package Lessons2;

import java.util.Scanner;

public class CalculatorConstructorsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "да";
        while (answer.equals("да")) {
            System.out.print("Введите первое число: ");
            float firstNumber = scanner.nextFloat();

            System.out.print("Введите знак операций: ");
            char sing = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            float secondNumber = scanner.nextFloat();

            CalculatorConstructors calcContr = new CalculatorConstructors(firstNumber, sing, secondNumber);

            calcContr.calc();

            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}
