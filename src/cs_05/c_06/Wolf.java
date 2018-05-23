package cs_05.c_06;

//生物类
class Creature{
    public Creature(){
        System.out.println("Creature的无参构造器");
    }
}

//动物类
class Animal extends Creature{
    public Animal(String name){
        System.out.println("Animal带一个参数的构造器" + "动物的名字为 ： " + name);
    }
    public Animal(String name, int age){
        this(name);
        System.out.println("Animal带两个参数的构造器" + "动物的年龄为 " + age);
    }
}

//狼类
public class Wolf extends Animal{
    public Wolf(){
        super("灰太狼", 3);//没有这句，会报错，因为父类构造器，没有被执行
        System.out.println("Wolf 无参构造器");
    }
    public static void main(String[] args){
        new Wolf();
    }
}
