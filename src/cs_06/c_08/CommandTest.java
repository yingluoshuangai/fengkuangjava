package cs_06.c_08;

import cs_06.c_06.Command;
import cs_06.c_06.ProcessArray;

/**
 * 使用匿名内部类，实现命令模式
 */
public class CommandTest {
    public static void main(String[] args){
        ProcessArray pa = new ProcessArray();
        int[] target = {1, 2, 3, 4};
        pa.process(target, new Command(){
            public void process(int[] target){
                int sum = 0;
                for(int tmp : target){
                    sum += tmp;
                }
                System.out.println("数组元素总和是:" + sum);
            }
        });
    }
}
