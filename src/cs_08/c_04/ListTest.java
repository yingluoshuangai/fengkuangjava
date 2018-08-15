package cs_08.c_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/15
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 List 在 Java8 新增的sort方法和replaceAll方法
 *
 * default void	sort(Comparator<? super E> c)
 * Sorts this list according to the order induced by the specified Comparator.
 * 通过指定的Comparator接口，对list进行排序
 *
 * default void	replaceAll(UnaryOperator<E> operator)
 * Replaces each element of this list with the result of applying the operator to that element.
 * 将该list中的每个元素替换成将operator应用于该元素的结果
 *
 */
public class ListTest {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("Java编程思想");
        books.add("SQL基础教程");
        books.add("数据结构（C语言版）");
        books.add("Effective Java 中文版");

        //根据字符串长度排序, 字符串小的在前面
        books.sort((o1, o2) -> {return ((String)o1).length() - ((String)o2).length();});
        System.out.println(books);
        //根据字符串长度排序， 字符串长的在前面
        books.sort(new Comparator(){
            public int compare(Object o1, Object o2){
                return ((String)o2).length() - ((String)o1).length();
            }
        });
        System.out.println(books);


        //使用每个元素的长度，来代替原来的元素
        books.replaceAll(o1 -> ((String)o1).length());
        System.out.println(books);
    }
}
