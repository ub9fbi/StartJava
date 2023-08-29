package Lessons2;

public class Calculator {
    private double firstNumber;
    private char sing;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setSing(char sing) {
        this.sing = sing;
    }

    public double getFirstNumber() {
        return this.firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void calc () {
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
                for(int i = 1; (double)i <= this.secondNumber; ++i) {
                    result *= firstNumber;
                }
                System.out.println(result);
            default:
                System.out.println("Математическая операция не поддерживается");
        }
    }
}