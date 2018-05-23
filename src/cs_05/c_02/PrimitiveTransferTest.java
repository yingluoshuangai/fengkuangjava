package cs_05.c_02;

public class PrimitiveTransferTest {
    public static void swap(int a, int b){
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("swap方法: a = " + a + "b = " + b);
    }
    public static void main(String[] args){
        int a = 6;
        int b = 9;
        PrimitiveTransferTest.swap(a, b);
        System.out.println("交换结束: a = " + a + " b = " + b);
    }
}
