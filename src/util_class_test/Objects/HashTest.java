package util_class_test.Objects;

import java.util.Objects;

/***
 * CREATER: AT
 * DATE: 2018/7/6
 * @Description: 测试public static int hash(Object... values)
 **/
public class HashTest {
    public static void main(String[] args){
        System.out.println("a".hashCode());//97
        System.out.println(Objects.hashCode("a"));//97
        System.out.println(Objects.hash("a"));//输出128，这时因为即使只有一个Object，他依然调用的是Arrays.hashCode(Object[])方法，而不是Object.hashCode()方法
    }
}
