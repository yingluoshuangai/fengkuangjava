package util_class_test.Objects;

import java.util.Objects;

/**
 * @Author: AT
 * @Date: 2018/7/6
 * @Description: 测试toString()方法
 * @Remark: Down to earth, you can look up at the stars
 */
public class ToStringTest {
    public static void main(String[] args){
        Student s1 = new Student("德邦总管 赵信", "22");
        System.out.println(Objects.toString(s1));
        System.out.println(Objects.toString(null));
        System.out.println(Objects.toString(null, "是个null"));
    }
}
