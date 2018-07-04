package cs_06.c_10;

/**
 * 测试Java的 垃圾回收机制
 * 我们可以建议Java进行垃圾回收，但是Java是否进行垃圾回收依然不确定。
 * ①建议Java进行垃圾回收的方式
 * 1. 调用System.gc()
 * 2. 调用 Runtime.getRuntime().gc()
 */
public class GcTest {
    public static void main(String[] args){
        for(int i = 0 ; i < 4 ; i++){
            new GcTest();

            //System.gc();
            Runtime.getRuntime().gc();
        }
    }
    //重写finalize()
    public void finalize(){
        System.out.println("系统正在清理GcTest对象");

    }
}
