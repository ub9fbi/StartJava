package Lessons2;

public class Calculator {
    private double firstNumber;
    private char sing;
    private double secondNumber;
    private int result;

    public Calculator() {
    }

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

    public int getResult() {
        switch (this.sing) {
            case '%':
                this.result = (int)(this.firstNumber % this.secondNumber);
                break;
            case '*':
                this.result = (int)(this.firstNumber * this.secondNumber);
                break;
            case '+':
                this.result = (int)(this.firstNumber + this.secondNumber);
                break;
            case '-':
                this.result = (int)(this.firstNumber - this.secondNumber);
                break;
            case '/':
                if (this.secondNumber != 0.0) {
                    this.result = (int)(this.firstNumber / this.secondNumber);
                }
                break;
            case '^':
                this.result = 1;

                for(int i = 1; (double)i <= this.secondNumber; ++i) {
                    this.result = (int)((double)this.result * this.firstNumber);
                }

                return this.result;
            default:
                System.out.println("Математическая операция не поддерживается");
        }

        return this.result;
    }
}

