package cs_08.c_03;

import java.util.TreeSet;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/13
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 TreeSet的 定制排序
 */
public class TreeSetTest4 {
    public static void main(String[] args) {
        //按age，倒序排序
        TreeSet ts = new TreeSet((o1, o2) -> {
            M m1 = (M)o1;
            M m2 = (M)o2;
            //age越大，M对象反而越小
            return m1.age > m2.age ? -1
                    : m1.age < m2.age ? 1 : 0;
        });
        ts.add(new M(10));
        ts.add(new M(-5));
        ts.add(new M(6));
        System.out.println(ts);

    }
}

class M{
    int age;

    public M(int age){
        this.age = age;
    }
    public String toString(){
        return "M[age:" + age + "]";
    }
}
