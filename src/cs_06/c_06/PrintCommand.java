package cs_06.c_06;

public class PrintCommand implements Command{
    public void process(int[] target){
        for(int tmp : target){
            System.out.println("迭代输出目标数组:" + tmp);
        }
    }
}
