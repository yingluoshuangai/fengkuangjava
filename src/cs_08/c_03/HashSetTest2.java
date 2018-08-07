package cs_08.c_03;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/7
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 当把可变对象添加到HashSet中之后，尽量不要去修改该集合元素中参与计算hashCode(),equals()的实例变量，否则将会导致HashSet无法正确操作这些元素。
 *
 * HashSet的查找，都是先按照hashCode找到指定位置，再通过equals判断是不是要寻找的元素
 * public boolean remove(Object o)
 * 先通过o对象的hashCode，找到HashSet中的指定位置，再通过o的equals方法，判断是否相等，如果相等，则删除，并返回true
 * public boolean contains(Object o)
 *  先通过o对象的hashCode，找到HashSet中的指定位置，再通过o的equals方法，判断是否相等，如果相等，则返回true
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new R(1));
        hs.add(new R(2));
        hs.add(new R(3));
        hs.add(new R(4));
        System.out.println(hs);

        //创造脏数据
        Iterator it = hs.iterator();
        R first = (R)it.next();
        first.count = 2;// 第一个元素和第二个元素的hashCode()和equals()都相等，对于HashSet来说，他们两是相同元素，但是第一个元素已经进来了，这就变成HashSet中的脏数据
        System.out.println(hs);

        //第二个元素被删除，因为HashSet先找到hashCode为2的位置，然后通过equals方法比较相等，然后删除第二个元素，第一个元素因为在hashCode为1的位置，所以没被删除
        hs.remove(new R(2));
        System.out.println(hs);

        System.out.println(hs.contains(new R(1)));//第一个元素与这个元素，hashCode相等，但是equals不相等
        System.out.println(hs.contains(new R(2)));//第一个元素与这个元素，在hashCode为2的位置上没有元素，所以不相等
    }
}
class R{
    int count;
    public R(int count){
        this.count = count;
    }
    public String toString(){
        return "R[count: " + count + "]";
    }
    //重写equals(), 只要count相等，则返回true
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj != null && R.class == obj.getClass()){
            R r = (R)obj;
            return this.count == r.count;
        }
        return false;
    }
    //重写hashCode(), 返回count
    public int hashCode(){
        return count;
    }
}
