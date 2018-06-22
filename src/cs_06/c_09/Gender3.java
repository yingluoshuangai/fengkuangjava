package cs_06.c_09;

/**
 * 测试 “实现接口的枚举类”
 * 每个枚举对象都有个info方法用于输出该枚举类的作用
 * 但是每个枚举对象调用该方法呈现的都是相同的行为方式
 */
public enum Gender3 implements GenderDesc{
    MALE("男"),FEMALE("女");

    private String name;
    private Gender3(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void info(){
        System.out.println("这是一个用于定义性别的枚举类");
    }
}
