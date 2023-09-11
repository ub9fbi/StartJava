package Bookcase;

import java.util.Scanner;

public class BookShelfTest {
    private static Scanner console;

    public static void main(String[] args) {
        do {
            printBookshilf();
            printMenu();
        } while (selectMenuItem() != EXIT);
    }

    private static void printMenu() {
    }

    private static void printBookshilf() {
    }

    private static int selectMenuItem() {
        String item = console.nextLine();
        switch (item) {
            case "1" -> saveBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "5" -> {
                return EXIT;
            }
            default -> System.out.println("Данная команда не поддерживается. Введите номер из списка.");
        }
        pressEnter();

        return 0;
    }

    private static void pressEnter() {
    }

    private static void deleteBook() { // удалить книгу
        
    }

    private static void findBook() { // наити книгу
        
    }

    private static void saveBook() { //Сохранить книгу
        
    }

}
