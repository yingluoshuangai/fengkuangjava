package cs_06.c_09;

/**
 * 测试 “实现接口的枚举类”
 * ①通过'匿名内部类'使每个枚举对象的info方法的行为方式都不同
 *
 * ②匿名内部类，继承的不是别的类，而是它的外面的类
 *
 * ③可以通过“定义抽象类”，来替代“实现接口”的这种方式
 */
public enum Gender4 implements GenderDesc{
    /**
     * Gender4这个类的匿名内部类 又同时继承了Gender4这个父类
     * Gender4这个类的匿名内部类，又同时是Gender4的匿名子类
     * 当创建MALE，FEMALE枚举值时，并不是创建Gender4枚举类的实例，而是创建Gender4的匿名子类的实例
     * 等价于
     * public static final Gender4 MALE = new Gender4("男"){
     *     public void info(){
     *         System.out.println("这个枚举值代表‘男’");
     *     }
     * }
     *
     */
    MALE("男"){
        public void info(){
            System.out.println("这个枚举值代表‘男’");
        }
    },FEMALE("女"){
        public void info(){
            System.out.println("这个枚举值代表'女'");
        }
    };

    private String name;
    private Gender4(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
