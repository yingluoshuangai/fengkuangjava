package cs_06.c_09;

/**
 * 测试带实例变量的枚举类
 */
public class GenderTest {
    public static void main(String[] args){
        Gender g = Gender.valueOf("FEMALE");
        g.setName("女");
        System.out.println(g + "代表的值：" + g.getName());
        Gender g1 = Gender.valueOf("MALE");
        g1.setName("男");
        System.out.println(g1 + "代表的值： " + g1.getName());

        //将实例变量设为final，更方便，更安全点
        Gender2 g2 = Gender2.valueOf("FEMALE");
        System.out.println(g2 + "代表的值： " + g2.getName());

        //测试实现接口的枚举类
        Gender3 g3 = Gender3.valueOf("MALE");
        Gender3 g4 = Gender3.valueOf("FEMALE");
        g3.info();
        g4.info();
        Gender4 g5 = Gender4.valueOf("MALE");
        Gender4 g6 = Gender4.valueOf("FEMALE");
        g5.info();
        g6.info();
    }

}
