package cs_07.cs_01;

import java.util.Scanner;

/**
 * 测试Scanner，获取键盘输入
 */
public class ScannerKeyBoardTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //以回车作为分隔符
        sc.useDelimiter("\n");
        while(sc.hasNext()){
            System.out.println("键盘输入内容为：" + sc.next());
        }
    }
}
