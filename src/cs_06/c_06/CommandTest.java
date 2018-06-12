package cs_06.c_06;

/**
 * 使用接口，实现命令模式
 * 命令模式：只有当命令下达时，才知道命令是什么。再此之前命令是不确定的。
 */
public class CommandTest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {1, 2, 3, 4};
        pa.process(target, new PrintCommand());
        pa.process(target, new AddCommand());
    }

}
