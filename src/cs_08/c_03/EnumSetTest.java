package cs_08.c_03;

import java.util.EnumSet;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/15
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 EnumSet
 * static <E extends Enum<E>> EnumSet<E>	allOf(Class<E> elementType)
 * Creates an enum set containing all of the elements in the specified element type. 创建一个包含指定枚举类型的所有枚举值的EnumSet
 *
 * EnumSet<E>	clone()
 * Returns a copy of this set.
 *
 * static <E extends Enum<E>>EnumSet<E>	complementOf(EnumSet<E> s)
 * Creates an enum set with the same element type as the specified enum set, initially containing all the elements of this type that are not contained in the specified set.
 * 创建一个和指定EnumSet相同枚举类型的Enumset，初始化包含这个枚举类型中指定EnumSet没有包含的所有枚举值
 *
 * static <E extends Enum<E>>EnumSet<E>	copyOf(Collection<E> c)
 * Creates an enum set initialized from the specified collection. 将指定collection转化成EnumSet
 *
 * static <E extends Enum<E>>EnumSet<E>	copyOf(EnumSet<E> s)
 * Creates an enum set with the same element type as the specified enum set, initially containing the same elements (if any).
 * 创建一个EnumSet和这个指定EnumSet有相同枚举类型，初始化包含相同元素。（将EnumSet复制）
 *
 * static <E extends Enum<E>>EnumSet<E>	noneOf(Class<E> elementType)
 * Creates an empty enum set with the specified element type.
 * 创建一个指定枚举类型的空的EnumSet
 *
 * static <E extends Enum<E>>EnumSet<E>	of(E e)
 * Creates an enum set initially containing the specified element.
 * 创建一个EnumSet，初始化包含这个指定枚举值
 *
 * static <E extends Enum<E>>EnumSet<E>	range(E from, E to)
 * Creates an enum set initially containing all of the elements in the range defined by the two specified endpoints.
 * 创建一个EnumSet，初始化包含由两个指定端点定义的范围内的所有元素
 */
public class EnumSetTest {
    public static void main(String[] args) {
        EnumSet es1 = EnumSet.allOf(Season.class);//创建一个EnumSet，集合元素是Season的所有枚举值
        System.out.println(es1);

        EnumSet es2 = EnumSet.noneOf(Season.class);//创建一个空的EnumSet，指定集合元素是Season的枚举值
        System.out.println(es2);
        es2.add(Season.SPRING);//手动添加元素
        es2.add(Season.SUMMER);
        System.out.println(es2);

        EnumSet es3 = EnumSet.of(Season.FALL, Season.WINTER);//以指定枚举值创建EnumSet
        System.out.println(es3);

        EnumSet es4 = EnumSet.complementOf(es3);//es3的补集
        System.out.println(es4);

    }
}
enum Season{
    SPRING,SUMMER,FALL,WINTER;
}
