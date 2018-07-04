package util_class_test.Objects;

import java.util.Comparator;
import java.util.Objects;

/**
 * Objects 类, 主要对Object对象进行处理的工具类
 * public static <T> int compare(T a, T b, Comparator<? super T> c)
 *
 * ①和②比较， 没有调用equals方法，说明只是先简单的通过内存地址比较，如果相等返回0。否则调用c.compare(a,b)方法进行比较
 */
public class CompareTest {
    public static void main(String[] args) {
        Student s1 = new Student("储昭著", "22");
        Student s2 = new Student("章鱼", "20");
        Student s3 = s1;

        //①
        int result = Objects.compare(s1, s2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println("调用comparator");
                if (o1.getName().equals(o2.getName())) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println("compare方法的结果是：" + result);
        //②
        int result1 = Objects.compare(s1, s3, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println("调用comparator");
                if (o1.getName().equals(o2.getName())) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println("compare方法的结果是：" + result1);
        //③
//        int result2 = Objects.compare(s1, null, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getName().equals(o2.getName())) {
//                    return 0;
//                }
//                return 1;
//            }
//        });
        //④
        int result3 = Objects.compare(null, null, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                System.out.println("调用comparator");
                if (o1.getName().equals(o2.getName())) {
                    return 0;
                }
                return 1;
            }
        });
        System.out.println("compare方法的结果是：" + result3);
    }


}
