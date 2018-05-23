package cs_05.c_02;

public class Recursive {
    public static int a;
    public static int fn(int n){
        System.out.println("run ：" + a++ + " n : " + n);
        if(n == 0){
            return 1 ;
        }
        else if(n == 1){
            return 4;
        }
        else{
            //return fn(n + 2) - 2 * fn(n +1);
            return 2 * fn(n -1) + fn(n -2);
        }
    }
    public static void main(String[] args){
        System.out.println("result : " + fn(10));
    }
}
