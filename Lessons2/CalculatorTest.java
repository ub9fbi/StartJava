package Lessons2;

import java.util.Scanner;

public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        for(String continueCal = "yes"; continueCal.equals("yes"); continueCal = scanner.nextLine()) {
            System.out.print("Введите число 1 : ");
            double firstNumber = scanner.nextDouble();
            calculator.setFirstNumber(firstNumber);
            System.out.print("Введите знак математической операций: ");
            char sing = scanner.next().charAt(0);
            calculator.setSing(sing);
            System.out.print("Введите число 2 : ");
            double secondNumber = scanner.nextDouble();
            calculator.setSecondNumber(secondNumber);
            System.out.println(calculator.getResult());
            System.out.print("Хотите продолжить вычисления? [yes/no]:");
        }

    }
}
