package Lessons2;

public class Jaeger {
    private String modelName; // Имя
    private String mark; // марка
    private String origin; // произхождение
    private float height; // высота
    private float weight; // вес

    public Jaeger(String modelName, String mark, String origin, float height, float weight) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
    }

    public Jaeger() {

    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public boolean drift () {
        System.out.println("Вы пошли");
        return true;
    }
    public void move () {
        System.out.println("Вы прошли 10 шагов");
    }
    public String scanKaiju () {
        return "nothing";
    }
    public void useWeapon () {
        System.out.println("Огонь!!!");
    }

    @Override
    public String toString() {
        return "Jaeger{" +
                "modelName='" + modelName + '\'' +
                ", mark='" + mark + '\'' +
                ", origin='" + origin + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
