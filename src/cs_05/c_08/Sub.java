package cs_05.c_08;

class Base{
    public Base(){
        test();
    }
    public void test(){
        System.out.println("Base的test方法");
    }
}
public class Sub extends Base{
    public void test(){
        System.out.println("Sub的test方法");
    }

    public static void main(String[] args){
        Sub s = new Sub();
    }
}
