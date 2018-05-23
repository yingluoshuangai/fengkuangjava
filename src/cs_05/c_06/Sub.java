package cs_05.c_06;

class Base{
    public double size;
    public String name;
    public Base(double size, String name){
        this.size = size;
        this.name = name;
    }
}
public class Sub extends Base{
    public String color;
    public Sub(double size, String name, String color){
        super(size, name);
        this.color = color;
    }
    public static void main(String[] args){
        Sub s = new Sub(32, "苹果", "红色");
        System.out.println("size : " + s.size + " -- name : " + s.name + " -- color : " + s.color);
    }
}
