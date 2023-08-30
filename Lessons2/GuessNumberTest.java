package Lessons2;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        String firstName = scanner.nextLine();
        Player playerOne = new Player(firstName);

        System.out.println("Введтите имя второго игрока: ");
        String secondName = scanner.nextLine();
        //Player playerTwo = new Player(secondName);
    }
}
