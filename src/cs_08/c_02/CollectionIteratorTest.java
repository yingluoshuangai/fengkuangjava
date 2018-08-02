package cs_08.c_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @Author: AT
 * @Date: 2018/8/2
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 集合遍历测试
 */
public class CollectionIteratorTest {
    public static void main(String[] args) {

        Collection<String> c5 = new ArrayList<>();
        c5.add("小萝莉");
        c5.add("御姐");
        c5.add("人妻");

        //TODO 使用 Collection的 forEach方法(java8 新增)
        System.out.println("使用forEach 遍历");
        c5.forEach(obj -> System.out.println(obj));//Lambda
//        System.out.println("匿名内部类写法：");
//        c5.forEach(new Consumer<String>(){
//            public void accept(String obj){
//                System.out.println(obj);
//            }
//        });

        //TODO 使用Iterator 遍历
        System.out.println("使用Iterator 遍历：");
        Iterator iterator1 = c5.iterator();
        while(iterator1.hasNext()){
            String cc = (String)iterator1.next();
            System.out.println(cc);

        }

        // TODO 使用Iterator的forEachRemaining的方法
        System.out.println("使用Iterator的forEachRemaining的方法");
        Iterator iterator2 = c5.iterator();
        iterator1.forEachRemaining(obj -> System.out.println(obj));//forEachRemaining是针对Iterator中剩下的元素，进行遍历，而在上方iterator1对象的所有元素都遍历过了,所以没有输出
        iterator2.forEachRemaining(obj -> System.out.println(obj));


        // TODO 使用增强型for循环
        System.out.println("使用增强型for循环");
        for(String s : c5){
            System.out.println(s);
        }

    }
}
