package cs_08.c_06;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedHashMap;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/9/7
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 *
 * default void forEach(BiConsumer<? super K,? super V> action)
 * Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
 * Unless otherwise specified by the implementing class, actions are performed in the order of entry set iteration (if an iteration order is specified.)
 * Exceptions thrown by the action are relayed to the caller.
 * 给这个map中的所有元素执行action方法，知道所有元素都执行或者action方法抛出异常
 * 除非这个实现类有其他指定，否则按实体对组成的set的迭代顺序执行action（如果指定了迭代顺序）
 * 这个action抛出的异常将中继给调用方
 * entry：key与value组成的实体对 (Entry是Map提供的一个内部类用来封装key-value对)
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap scores = new LinkedHashMap();
        scores.put("语文", 95);
        scores.put("数学", 25);
        scores.put("英语", 84);
        scores.forEach((key, value) -> System.out.println( key + "-->" + value));
    }
}
