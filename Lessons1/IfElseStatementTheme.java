package Lessons1;

public class IfElseStatementTheme {
    public IfElseStatementTheme() {
    }

    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMen = false;
        int age = 20;
        double height = 1.8;
        if (!isMen) {
            System.out.println("Привет Анатолий");
        } else {
            System.out.println("Привет Анна");
        }

        if (age > 18) {
            System.out.println("Тебе можно водить автомобиль");
        } else {
            System.out.println("Тебе пока рано садится за руль");
        }

        if (height < 1.8) {
            System.out.println("Твой рост ниже 1.8 метра");
        } else {
            System.out.println("Твой рост выше 1.8 метра");
        }

        char OneFirstName = "Anatoly".charAt(0);
        if (OneFirstName == 'A') {
            System.out.println("Первая буква 'A' \n");
        } else if (OneFirstName == 'I') {
            System.out.println("Первая буква 'I' \n");
        } else {
            System.out.println("В имени нет букв 'A' and 'I' \n");
        }

        System.out.println("2. Поиск большого числа");
        int num1 = 90;
        int num2 = 76;
        if (num1 > num2) {
            System.out.println("Первое число больше второго\n");
        } else if (num1 < num2) {
            System.out.println("Второе число больше первого\n");
        } else if (num1 == num2) {
            System.out.println("Числа равны\n");
        }

        System.out.println("3. Проверка числа");
        int num3 = 1;
        if (num3 != 0) {
            if (num3 % 2 == 0 && num3 > 0) {
                System.out.println("Число " + num3 + "является положительным и четное");
            } else if (num3 % 2 != 0 && num3 < 0) {
                System.out.println("Число " + num3 + " является отрицательным и не четным");
            } else if (num3 % 2 != 0 && num3 > 0) {
                System.out.println("Число " + num3 + " является положительным и не четным");
            }
        }

        System.out.println("4. Поиск одинковых цифр в числах");
        int num4 = 123;
        int num5 = 214;
        int n11 = num4 % 10;
        int n12 = (num4 % 100 - n11) / 10;
        int n13 = (num4 % 1000 - n11) / 100;
        int n21 = num5 % 10;
        int n22 = (num5 % 100 - n21) / 10;
        int n23 = (num5 % 1000 - n21) / 100;
        if (n11 != n21 && n12 != n22 && n13 != n23) {
            System.out.println("Равных чисел нет");
        } else {
            System.out.println("" + num4 + " " + num5);
            if (n11 == n21) {
                System.out.println("" + n11 + " его разряд первый");
            }

            if (n12 == n22) {
                System.out.println("" + n12 + " его разряд второй");
            }

            if (n13 == n23) {
                System.out.println("" + n13 + " его разряд третий");
            }
        }

        System.out.println("5. Определение символа по его коду");
        char symbol = 'W';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Не буква и не цифра");
        }

        System.out.println("6. Подсчет суммы вклада и начисленных банком %");
        int sumVklad = 200000;
        double historyProcent;
        if (sumVklad < 100000) {
            historyProcent = (double)sumVklad * 0.01 * 5.0;
            System.out.println("Сумма вклада: " + sumVklad + "\nСумма начисленного процента: " + historyProcent + "\nИтоговая сумма: " + ((double)sumVklad + historyProcent));
        } else if (100000 < sumVklad && sumVklad < 300000) {
            historyProcent = (double)sumVklad * 0.01 * 7.0;
            System.out.println("Сумма вклада: " + sumVklad + "\nСумма начисленного процента: " + historyProcent + "\nИтоговая сумма: " + ((double)sumVklad + historyProcent));
        } else if (sumVklad > 300000) {
            historyProcent = (double)sumVklad * 0.01 * 10.0 + (double)sumVklad;
            System.out.println("Сумма вклада: " + sumVklad + "\nСумма начисленного процента: " + historyProcent + "\nИтоговая сумма: " + ((double)sumVklad + historyProcent));
        }

        System.out.println("7. Определение оценки по предметам");
        historyProcent = 58.0;
        double programinProcent = 92.0;
        int historyGrade = 0;
        int programinGrade = 0;
        if (historyProcent <= 60.0) {
            historyGrade = 2;
            System.out.println("История: " + historyGrade);
        } else if (historyProcent > 60.0 && historyProcent <= 73.0) {
            historyGrade = 3;
            System.out.println("История: " + historyGrade);
        } else if (historyProcent > 73.0 && historyProcent <= 93.0) {
            historyGrade = 4;
            System.out.println("История: " + historyGrade);
        } else if (historyProcent > 93.0 && historyProcent <= 100.0) {
            historyGrade = 5;
            System.out.println("История: " + historyGrade);
        }

        if (programinProcent <= 60.0) {
            programinGrade = 2;
            System.out.println("Информатика: " + programinGrade);
        } else if (programinProcent > 60.0 && programinProcent <= 73.0) {
            programinGrade = 3;
            System.out.println("Информатика: " + programinGrade);
        } else if (programinProcent > 73.0 && programinProcent <= 93.0) {
            programinGrade = 4;
            System.out.println("Информатика: " + programinGrade);
        } else if (programinProcent > 93.0 && programinProcent <= 100.0) {
            programinGrade = 5;
            System.out.println("Информатика: " + programinGrade);
        }

        double averageGrade = (double)(historyGrade + programinGrade) / 2.0;
        System.out.println("Средний балл оценок: " + averageGrade);
        double averagePercentage = (historyProcent + programinProcent) / 2.0;
        System.out.println("Средний % по предметам: " + averagePercentage);

        System.out.println("8. Расчет годовои прибыли");
        int soldPerMonth = 15000;
        int rentOfPremises = 5000;
        int costOfProduction = 9000;
        int annualProfit = (soldPerMonth - rentOfPremises - costOfProduction) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit);
        } else if (annualProfit < 0) {
            System.out.println("Прибыль за год: " + annualProfit);
        } else {
            System.out.println("Прибыль за год: " + annualProfit);
        }

    }
}

