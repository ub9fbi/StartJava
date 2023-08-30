package Lessons2;

public class CalculatorConstructors {
    private double firstNumber;
    private char sing;
    private double secondNumber;

    public CalculatorConstructors(double firstNumber, char sing, double secondNumber) {
        this.firstNumber = firstNumber;
        this.sing = sing;
        this.secondNumber = secondNumber;
    }
    public void calc() {
        switch (sing) {
            case '%':
                System.out.println(firstNumber % secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '/':
                if (secondNumber != 0.0) {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case '^':
                int result = 1;
                for (int i = 1; (double) i <= this.secondNumber; ++i) {
                    result *= firstNumber;
                }
                System.out.println(result);
            default:
                System.out.println("Математическая операция не поддерживается");
        }
    }
}
