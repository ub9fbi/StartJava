package Lessons2;

    // Класс описывает игроков (один экземпляр класса соответствует одному игроку)
public class Player {
        private String name;
        private int firstNumber;
        private int secondNumber;
        public Player(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
}
