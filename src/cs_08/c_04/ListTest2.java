package cs_08.c_04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/16
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 List的 listIterator方法
 *
 * ListIterator<E>	listIterator()
 * Returns a list iterator over the elements in this list (in proper sequence).
 * 返回这个list中元素的list迭代器（按适当顺序）
 *
 * ListIterator<E>	listIterator(int index)
 * Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
 * 从list的指定位置开始，返回这个list中元素的list迭代器（按适当顺序）
 *
 * ListIterator接口继承了Iterator
 * listIterator 和 iterator的区别是：1. 增加了向前迭代的功能 2. 可以通过add方法向List中添加元素
 */
public class ListTest2 {
    public static void main(String[] args) {
        List books = new ArrayList();
        books.add("Java编程思想");
        books.add("SQL基础教程");
        books.add("数据结构（C语言版）");
        books.add("Effective Java 中文版");

        ListIterator lit = books.listIterator();
        //正向迭代
        while(lit.hasNext()){
            System.out.println(lit.next());
            lit.add("-----分隔符-----");
        }
        System.out.println(books);

        //反向迭代
        while(lit.hasPrevious()){
            System.out.println(lit.previous());
        }

    }
}
