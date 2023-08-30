package Lessons2;

import java.util.Scanner;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger сrimsonTyphoon = new Jaeger();

        сrimsonTyphoon.setModelName("Crimson Typhoon");
        сrimsonTyphoon.setMark("Mark-4");
        сrimsonTyphoon.setOrigin("China");
        сrimsonTyphoon.setHeight(76.2f);
        сrimsonTyphoon.setWeight(1.7f);

        Jaeger gipsyDanger = new Jaeger("Gipsy Danger","Mark-3","United States of America",79.2f,1.9f);

        System.out.println(сrimsonTyphoon);
        System.out.println(gipsyDanger);

        System.out.println(сrimsonTyphoon.scanKaiju());
        сrimsonTyphoon.useWeapon();
        сrimsonTyphoon.move();
        сrimsonTyphoon.drift();
    }
}
