package cs_08.c_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

/**
 * @Author: AT
 * @Date: 2018/8/4
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 对集合进行统计： 使用Java8中新增的Predicate函数式接口
 * 统计书名中出现“Java”的图书数量
 * 统计书名中出现“代码”的图书数量
 * 统计书名长度大于10的图书数量
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        Collection c1 = new HashSet();
        c1.add("Java编程思想");
        c1.add("Effective Java");
        c1.add("代码整洁之道");
        c1.add("数据结构（C语言版）");
        System.out.println("书名中包含Java的图书数量" + calAll(c1, obj -> ((String)obj).contains("Java")));
        System.out.println("书名中包含代码的图书数量" + calAll(c1, obj -> ((String)obj).contains("代码")));
        System.out.println("书名中长度大于10的图书数量" + calAll(c1, new Predicate(){
            public boolean test(Object obj){
                return ((String)obj).length() > 10;
            }
        }));//匿名内部类写法
    }
    public static int calAll(Collection books, Predicate p){
        int total = 0;
        for(Object obj : books){
            if(p.test(obj)){
                System.out.println(obj);
                total ++;
            }
        }
        return total;
    }
}
