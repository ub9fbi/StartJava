package Lessons2;
    // Класс отвечает за создание объектов,
    // их инициализацию, запуск игры, ввод и обработку ответа игрока о продолжении/завершении.

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String answer = "да";
        while (answer.equals("да")) {
            System.out.print("Введите имя первого игрока: ");
            String firstName = scanner.nextLine();
            System.out.print("Введите число:");

            System.out.println("Введтите имя второго игрока: ");
            String secondName = scanner.nextLine();
            System.out.print("Введите число:");

            System.out.print("Введите число 1 : ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите число 2 : ");
            int secondNumber = scanner.nextInt();

            Player playerName = new Player(firstName, firstNumber, secondName, secondNumber);

            do {
                System.out.print("Хотите продолжить игру? [да/нет]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("да") && !answer.equals("нет"));


        }
    }
}
