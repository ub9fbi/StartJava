package Lessons2;

    // Класс описывает игроков (один экземпляр класса соответствует одному игроку)
public class Player {
    private String firstName;
    private String secondName;
    private int firstNumber;
    private int secondNumber;
        public Player(String firstName, int firstNumber , String secondName, int secondNumber) {
        this.firstName = firstName;
        this.firstNumber = firstNumber;
        this.secondName = secondName;
        this.secondNumber = secondNumber;
    }
}
