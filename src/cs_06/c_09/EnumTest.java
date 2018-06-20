package cs_06.c_09;

public class EnumTest {
    public void judge(SeasonEnum s){
        //switch后的表达式可以是枚举类
        switch(s){
            case SPRING:{
                System.out.println("春天到了, 又到了发情的季节！");
                break;
            }
            case SUMMER : {
                System.out.println("夏天到了，又到了看泳衣的时候！");
                break;
            }
            case FALL : {
                System.out.println("秋天到了， 又到了援交的好日子！ ");
                break;
            }
            case WINTER : {
                System.out.println("冬天到了， 又到了研究白学的时候！");
                break;
            }
        }
    }

    public static void main(String[] args){
        //枚举类默认有一个value()方法，返回该枚举类的所有实例
        for(SeasonEnum s : SeasonEnum.values()){
            System.out.println(s);
        }
        //枚举类通过EnumClass.variable的形式来访问
        new EnumTest().judge(SeasonEnum.FALL);

        //枚举类的方法
        //int compareTo(E o) : 枚举实例与相同类型的枚举实例，进行顺序比较。
        int a = SeasonEnum.SPRING.compareTo(SeasonEnum.FALL);
        System.out.println(a);

        //String name() , Stirng.toString()
        //返回枚举实例的名称
        System.out.println(SeasonEnum.SPRING.name());
        System.out.println(SeasonEnum.SPRING.toString());

        //int ordinal() : 返回枚举实例的索引值。从0开始
        int b = SeasonEnum.FALL.ordinal();
        System.out.println(b);

        //返回指定枚举类中指定名称的枚举值
        SeasonEnum c = SeasonEnum.valueOf("FALL");
        System.out.println(c);
    }
}
