package cs_08.c_03;

import java.util.HashSet;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/5
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * Set集合和Collection基本相同，只是Set不允许包含重复元素
 * HashSet集合判断两个对象相等的标准是两个对象通过equals()方法比较相等，且两个对象的hashCode()方法返回值也相等
 *
 * 验证HashSet判断相等的标准
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(new A());//第一个元素，可以添加
        hs.add(new A());//equals方法相等，但hashCode方法不相等，可以添加
        hs.add(new B());//可以添加
        hs.add(new B());//equals方法不相等，hashCode方法相等， 可以添加
        hs.add(new C());//equals方法相等，hashCode方法不相等，可以添加
        hs.add(new C());//equals方法相等，hashCode方法相等，不可以添加
        System.out.println(hs);//应该只有5个对象，最后那个对象，因为相等，没有添加进去
    }
}

//类A， 重写equals方法
class A{
    public boolean equals(Object obj){
        return true;
    }
}

//类B， 重写hashCode方法
class B{
    @Override
    public int hashCode() {
        return 1;
    }
}

//类C， 重写equals方法和hashCode方法
class C{
    @Override
    public int hashCode() {
        return 2;
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}
