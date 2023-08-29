package Lessons2;

public class Wolf {
    private String gender;
    private String nickname;
    private int weight;
    private int age;
    private String color;

    public Wolf() {
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColor() {
        return this.color;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Не корректный возраст");
        } else {
            this.age = age;
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void go() {
        System.out.println("Идет");
    }

    public void sit() {
        System.out.println("Сидит");
    }

    public void toRun() {
        System.out.println("Бежит");
    }

    public void howl() {
        System.out.println("Воет");
    }

    public void hunting() {
        System.out.println("Охотится");
    }
}

