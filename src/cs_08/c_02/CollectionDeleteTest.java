package cs_08.c_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: AT
 * @Date: 2018/7/25
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 参考 ： https://blog.csdn.net/qq_27093465/article/details/79154566
 * 集合删除测试
 */
public class CollectionDeleteTest {
    public static void main(String[] args) {

        Collection<String> c5 = new ArrayList<>();
        c5.add("小萝莉");
        c5.add("御姐");
        c5.add("人妻");

        //TODO 1. 使用Collection 的 removeIf() 方法
        System.out.println("删除前结果:" + c5.toString());
        c5.removeIf(obj -> obj.equals("小萝莉"));
        System.out.println("删除后结果:" + c5.toString());

        //TODO 2. 使用Iterator 的 remove() 方法
        Collection<String> c6 = new ArrayList<>();
        c6.add("艾伦");
        c6.add("三笠");
        c6.add("爱尔敏");
        System.out.println("删除前结果:" + c6.toString());
        Iterator iterator1 = c6.iterator();
        while(iterator1.hasNext()){
            String s = (String)iterator1.next();
            if(s.equals("艾伦")){
                iterator1.remove();
            }
        }
        System.out.println("删除后结果:" + c6.toString());

        //TODO 3. 使用 for 循环
        Collection<String> c7 = new ArrayList<>();
        c7.add("路飞");
        c7.add("乔治");
        c7.add("乌索普");
        System.out.println("删除前结果:" + c7.toString());
        ArrayList<String> arrayList = (ArrayList)c7;
        for( int i = 0 ; i < arrayList.size() ; i ++ ){
            if(arrayList.get(i).equals("路飞")){
                arrayList.remove(i);
                i --;//要对索引进行重新编排
            }
        }
        System.out.println("删除后结果:" + arrayList.toString());


        //TODO 4. 错误的删除
        //使用增强型for循环会直接报错。


    }
}
