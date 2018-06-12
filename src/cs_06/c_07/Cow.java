package cs_06.c_07;

/**
 * 测试内部类
 * 内部类：我想要一个对象，所以我需要一个类，而这个对象我只在当前类中使用，如果再新建个类文件，就显得太过于繁琐，所以可以在当前类中创建一个内部类。
 */
public class Cow {
    private double weight;
    public Cow(){}
    public Cow(double weight){
        this.weight = weight;
    }
    public void test(){
        CowLeg cowLeg = new CowLeg(1.01, "黑白相间");
        cowLeg.info();
    }
    public static void main(String[] args){
        Cow cow = new Cow(378.9);
        cow.test();
    }
    //内部类
    private class CowLeg{
        private double length;
        private String color;
        public CowLeg(){}
        public CowLeg(double length, String color){
            this.length = length;
            this.color = color;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        //内部类的方法
        public void info(){
            System.out.println("当前牛腿颜色是：" + color + ", 高： " + length);
        }
    }
}
