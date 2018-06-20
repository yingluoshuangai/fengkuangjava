package cs_06.c_09;

/**
 * 性别枚举类
 * 包含实例变量的枚举类处理
 *
 * 枚举类通常设计成不可变类，这样更安全。所以实例变量也应该用private final修饰。
 * 实例变量都用final修饰，这时就需要在“定义时赋初值”，“初始化块中赋值”，“构造器中赋值”。一般采用在构造器中赋初值。
 *
 * ① 在枚举类的第一行定义的枚举值，实际上都是默认调用枚举类的无参构造器创建的枚举类对象。只是没用new关键字和显示调用构造器。
 * 当定义了构造器，在枚举类的第一行定义枚举值时，无参构造器就没有了，需要申明调用的是那个构造器。
 */
public enum Gender2 {

    //public static final Gender2 MALE = new Gender2("男");
    //public static final Gender2 FEMALE = new Gender2("女");
    MALE("男"),FEMALE("女");

    private String name;
    private Gender2(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
