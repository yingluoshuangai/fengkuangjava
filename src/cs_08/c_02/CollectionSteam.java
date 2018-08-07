package cs_08.c_02;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/4
 * @Remark: Down to earth, you can look up at the stars
 * @Description: 使用Stream对集合进行统计
 * Collection中的方法
 * default Stream<E> stream() : 以这个集合作为来源，生成它的序列流。
 *
 * Stream中用到的方法
 * long count() : 统计stream中有多少元素
 * Stream<T> filter(Predicate<? super T> predicate) : 返回一个Stream，是由原Stream中满足predicate条件的元素组成的。
 *                                                      简而言之，就是过滤Stream中不符合predicate的元素。
 *IntStream mapToInt(ToIntFunction<? super T> mapper) ： 返回一个IntStream， 它是由将给定function应用于原Stream的元素的结果组成的。
 * void forEach(Consumer<? super T> action) ： 对Stream中的每个元素，执行action。
 *
 */
public class CollectionSteam {
    public static void main(String[] args) {
        Collection c1 = new HashSet();
        c1.add("Java编程思想");
        c1.add("Effective Java");
        c1.add("代码整洁之道");
        c1.add("数据结构（C语言版）");

        //集合中包含“Java”的数量
        System.out.println(c1.stream()
                .filter(obj -> ((String)obj).contains("Java"))
                .count());

        //集合中包含“代码”的数量
        System.out.println(c1.stream()
                .filter(new Predicate(){
                    public boolean test(Object obj){
                       return ((String)obj).contains("代码");
                    }
                })
                .count());

        //集合中元素长度大于10的数量
        System.out.println(c1.stream()
                .filter(obj -> ((String)obj).length() > 10)
                .count());

        //集合中的所有元素长度输出
        System.out.println("集合中的所有元素长度：");
        c1.stream()
                .mapToInt(obj -> ((String)obj).length())
                .forEach(obj -> System.out.println(obj));
        c1.stream()
                .mapToInt(obj -> ((String)obj).length())
                .forEach(System.out::println);//将Lambda表达式转变成类方法引用
    }
}
