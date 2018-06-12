package cs_06.c_07;

/**
 * 匿名内部类测试
 *
 * 问题一：匿名内部类为什么一定实现一个接口或继承一个类？
 * 因为匿名内部类没有名称，如果不实现一个接口或继承一个类，就没法调用了。
 * 所以语法规定“匿名内部类必须继承一个父类，或实现一个接口，但最多只能继承一个父类，或实现一个接口”。
 *
 * 问题二：匿名内部类为什么只能实现一个接口或继承一个类？
 */
public class AnonymousTest {
    public void test(Product p){
        System.out.println("购买了一个" + p.getName() + ", 花掉了" + p.getPrice());
    }
    public static void main(String[] args){
        AnonymousTest at = new AnonymousTest();
        at.test(new Product(){
            public double getPrice(){
                return 666.66;
            }
            public String getName(){
                return "映众 玩家国度 GTX1050Ti";
            }
        });
    }

}

/**
 * 匿名内部类实现的接口
 */
interface Product{
    public double getPrice();
    public String getName();
}
