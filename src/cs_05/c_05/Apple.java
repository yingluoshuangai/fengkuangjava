package cs_05.c_05;

public class Apple {
    public String name;
    public String color;
    public String weight;
    public Apple () {}
    public Apple (String name, String color){
        this.name = name;
        this.color = color;
    }
    public Apple (String name, String color, String weight){
        this(name, color);
        this.weight = weight;
    }

    public static void main(String[] args){
        Apple apple = new Apple("艾伦", "蓝", "32");
        System.out.println("apple对象是" + apple.name + apple.color + apple.weight);
    }
}
