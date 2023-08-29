package Lessons1;

public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("1. Вывод характеристик компьютера");
        char name = 'M';
        byte numberOfCores = 4;
        short deviceCode = 8832;
        int processorFrequency = 2500000;
        double ram = 16.7;
        boolean powerButton = true;

        System.out.println(name);
        System.out.println(numberOfCores);
        System.out.println(deviceCode);
        System.out.println(processorFrequency);
        System.out.println(ram);
        System.out.println(powerButton);

        System.out.println("2. Расчет стоимости товара со скидкой");
        int totalCost = 300;
        double sale = 33.0;
        double m = 300.0 - sale;
        System.out.println("Стоимость без скидки: " + totalCost);
        System.out.println("Размер скидки: " + sale);
        System.out.println("Общая стоимость товаров со скидкой: " + m);

        System.out.println("3. Вывод слова JAVA");
        System.out.println("    J      a      v     v       a");
        System.out.println("    J     a a      v   v       a a");
        System.out.println("J   J    aaaaa      v v       aaaaa");
        System.out.println(" JJ     a     a      v       a     a");

        System.out.println("4.  Вывод min и max значений целых числовых типов");
        byte numbByteMin = -128;
        ++numbByteMin;
        byte numbBiteMax = 127;
        numbBiteMax = (byte) (numbBiteMax - 1);
        System.out.println(numbByteMin);
        System.out.println(numbBiteMax);
        short shortMin = Short.MIN_VALUE;
        ++shortMin;
        short shortMax = 32767;
        --shortMax;
        System.out.println(shortMin);
        System.out.println(shortMax);
        int intMin = Integer.MIN_VALUE;
        ++intMin;
        int intMax = Integer.MAX_VALUE;
        --intMax;
        System.out.println(intMin);
        System.out.println(intMax);
        long longMin = Long.MIN_VALUE;
        ++longMin;
        long longMax = Long.MAX_VALUE;
        --longMax;
        System.out.println(longMin);
        System.out.println(longMax);

        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println(num1);
        System.out.println(num3);
        num3 = num1 * num3;
        num1 = num3 / num2;
        num2 = num3 / num1;
        System.out.println(num1);
        System.out.println(num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("6. Вывод символов и их кодов");
        int cod36 = 36;
        int cod42 = 42;
        int cod64 = 64;
        int cod124 = 124;
        int cod126 = 126;
        char symbol36 = '$';
        char symbol42 = '*';
        char symbol64 = '@';
        char symbol124 = '|';
        char symbol126 = '~';
        System.out.println("" + cod36 + " = " + symbol36);
        System.out.println("" + cod42 + " = " + symbol42);
        System.out.println("" + cod64 + " = " + symbol64);
        System.out.println("" + cod124 + " = " + symbol124);
        System.out.println("" + cod126 + " = " + symbol126);

        System.out.println("7. Вывод в консоль ASC|| - арт Дюка");
        char a = '/';
        char b = '\\';
        char c = '_';
        char d = '(';
        char e = ')';
        System.out.println("     " + a + b + "     ");
        System.out.println("    " + a + "  " + b + "    ");
        System.out.println("   " + a + c + " " + d + e + b + "   ");
        System.out.println("  " + a + "      " + b);
        System.out.println(" " + a + c + c + c + c + c + a + b + c + b);

        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int dig1 = 1;
        int dig2 = 2;
        int dig3 = 3;
        int number123 = 123;
        int number3 = 3;
        int number20 = (number123 % 100 - number3) / 10;
        int number100 = (number123 % 1000 - number3) / 100;
        System.out.println("Число " + number123 + " содержит: \n сотен - " + number100 + "\n десятков - " + number20 + "\n единиц - " + number3 + "\nСумма его цифр = " + (dig1 + dig2 + dig3) + "\nПроизведение = " + dig1 * dig2 * dig3);

        System.out.println("9. Вывод времени");
        int sec = 59;
        int minute = 59;
        int hour = 23;
        System.out.println("" + hour + ":" + minute + ":" + sec);
    }
}

