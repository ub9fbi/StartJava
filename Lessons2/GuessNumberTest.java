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
            Player Name1 = new Player(firstName);
            System.out.print("Введтите имя второго игрока: ");
            String secondName = scanner.nextLine();
            Player Name2 = new Player(secondName);

            GuessNumber game = new GuessNumber(Name1, Name2);
            game.start();
        } do {
            System.out.print("Хотите начать игру заново? [да/нет]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("да") && !answer.equals("нет"));
    }
}

