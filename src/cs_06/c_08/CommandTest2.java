package cs_06.c_08;

import cs_06.c_06.ProcessArray;

/**
 * 使用Lambda表达式，实现命令模式
 */
public class CommandTest2 {
    public static void main(String[] args){
        ProcessArray pa = new ProcessArray();
        int[] array = {1, 2, 3, 4};
        pa.process(array, (int[] target) ->{
            int sum = 0;
            for(int tmp : target){
                sum += tmp;
            }
            System.out.println("数组元素和是："+ sum);
        });
    }
}
