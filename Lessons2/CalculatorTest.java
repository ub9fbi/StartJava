package Lessons2;

import java.util.Scanner;

public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "да";
        while (answer.equals("да")) {
            System.out.print("Введите число 1 : ");
            double firstNumber = scanner.nextDouble();
            calculator.setFirstNumber(firstNumber);

            System.out.print("Введите знак математической операций: ");
            char sing = scanner.next().charAt(0);
            calculator.setSing(sing);

            System.out.print("Введите число 2 : ");
            double secondNumber = scanner.nextDouble();
            calculator.setSecondNumber(secondNumber);

            calculator.calc();
            do {
                System.out.print("Хотите продолжить вычисления? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));{

            }
        }
    }
}
