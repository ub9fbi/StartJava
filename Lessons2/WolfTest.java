package Lessons2;

import java.io.PrintStream;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setNickname("Анатолий");
        wolfOne.setAge(5);
        wolfOne.setColor("Black");
        wolfOne.setGender("Man");
        wolfOne.setWeight(100);
        PrintStream var10000 = System.out;
        String var10001 = wolfOne.getNickname();
        var10000.print(var10001 + "\n" + wolfOne.getAge() + "\n" + wolfOne.getColor() + "\n" + wolfOne.getGender() + "\n" + wolfOne.getWeight());
    }
}
