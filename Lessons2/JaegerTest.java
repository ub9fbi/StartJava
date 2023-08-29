package Lessons2;

import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger = new Jaeger();
        Scanner scanner = new Scanner(System.in);

        jaeger.setModelName("Crimson Typhoon");
        jaeger.setMark("Mark-4");
        jaeger.setOrigin("China");
        jaeger.setHeight(76);
        jaeger.setWeight(2);
    }
}
