package Lessons1;

public class Calculator {
    public Calculator() {
    }

    public static void main(String[] args) {
        double a = 25.0;
        double b = 3.0;
        char sign = '/';
        if (b != 0.0 && sign == '/') {
            double result = a / b;
            System.out.println("" + a + " " + sign + " " + b + " = " + result);
        } else {
            System.out.println("Делить на ноль нельзя!");
        }

        if (a > 0.0 && b != 0.0) {
            int base;
            if (sign == '-') {
                base = (int)(a - b);
                System.out.println("" + a + " " + sign + " " + b + " = " + base);
            } else if (sign == '+') {
                base = (int)(a + b);
                System.out.println("" + a + " " + sign + " " + b + " = " + base);
            } else if (sign == '*') {
                base = (int)(a * b);
                System.out.println("" + a + " " + sign + " " + b + " = " + base);
            } else if (sign == '^') {
                base = (int)a;
                int exponents = (int)b;
                int result = 1;

                for(int i = 1; i <= exponents; ++i) {
                    result *= base;
                }

                System.out.println("" + a + " " + sign + " " + b + " = " + result);
            } else if (sign == '%') {
                base = (int)(a % b);
                System.out.println("" + a + " " + sign + " " + b + " = " + base);
            }
        }

    }
}

