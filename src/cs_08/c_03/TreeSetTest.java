package cs_08.c_03;

import java.util.TreeSet;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/9
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * TreeSet, 元素处于排序状态
 *
 * public boolean add(E e) : 添加指定元素到该set，如果该set没有包含它
 * public E first() : 返回该set的第一个元素
 * public E last() : 返回该set的最后一个元素
 * public E lower(E e) : 返回该set中小于指定元素的最大元素，如果没有则返回null （参考元素不需要是TreeSet集合里的元素）
 * public E higher(E e) : 返回该set中大于指定元素的最小元素，如果没有则返回null （参考元素不需要是TreeSet集合里的元素）
 * public SortedSet<E> subSet(E fromElement, E toElement) : 返回此Set的子集和，范围从fromElement(包含) 到toElement(不包含)
 * public SortedSet<E> headSet(E toElement) : 返回此Set的子集，有小于toElement的元素组成
 * public SortedSet<E> tailSet(E fromElement) : 返回此Set的子集， 有大于或等于fromElement的元素组成
 *
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet nums = new TreeSet();
        nums.add(5);
        nums.add(2);
        nums.add(10);
        nums.add(-9);
        System.out.println(nums);//默认使用自然排序，对集合进行排序
        System.out.println(nums.first());//输出集合里的第一个元素
        System.out.println(nums.last());//输出集合里的最后一个元素
        System.out.println(nums.lower(5));//输出集合里小于5的最大元素
        System.out.println(nums.higher(5));//输出集合里大于5的最小元素
        System.out.println(nums.subSet(2,10));//输出集合里大于等于2，小于10的元素集合
        System.out.println(nums.headSet(10));//输出集合里小于10的元素集合
        System.out.println(nums.tailSet(2));//输出集合里大于2的元素集合
    }
}
