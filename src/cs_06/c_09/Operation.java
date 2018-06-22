package cs_06.c_09;

/**
 * Operation枚举类，4个枚举值PLUS, MINUS, TIMES, DIVIDE 分别代表加，减， 乘， 除。
 * 该枚举类需要定义一个eval()方法来完成计算
 * 方法一：定义一个eval()抽象方法，然后4个枚举值分别为eval()提供不同的实现。
 * 方法二：定义一个有eval()方法的接口，然后4个枚举值分别为eval()提供不同的实现。
 */
public enum Operation {

    PLUS{
        public double eval(double x, double y){
            return x + y;
        }
    },
    MINUS{
        public double eval(double x, double y){
            return x - y;
        }
    },
    TIMES{
        public double eval(double x, double y){
            return x * y;
        }
    },
    DIVIDE{
        public double eval(double x, double y){
            return x / y;
        }
    };
    //为枚举类定义的抽象方法
    public abstract double eval(double x, double y);

    //测试
    public static void main(String[] args){
        System.out.println(Operation.PLUS.eval(1,2));
        System.out.println(Operation.MINUS.eval(1, 2));
        System.out.println(Operation.TIMES.eval(1,2));
        System.out.println(Operation.DIVIDE.eval(1,2));
    }
}
