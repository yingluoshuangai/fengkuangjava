package util_class_test.Objects;

import java.util.Objects;
import java.util.function.Supplier;

/**
 * @Author: AT
 * @Date: 2018/7/6
 * @Remark: Down to earth, you can look up at the stars
 * @Description: 测试public static <T> T requireNonNull(T obj)
 *                 和public static <T> T requireNonNull(T obj,String message)
 */
public class RequireNonNullTest {
    public static void main(String[] args){
        Student s1 = new Student("暗裔剑魔", "20");
        Student s2;
        System.out.println(Objects.requireNonNull(s1));
        //Objects.requireNonNull(null);
//        Objects.requireNonNull(null);
//        Objects.requireNonNull(s1, "a参数是null值");
//        Objects.requireNonNull(null, "b参数是null值");
//        Objects.requireNonNull(null, new Supplier<String>(){
//            @Override
//            public String get() {
//                return "值为null, 匿名内部类写法";
//            }
//        });
//        Objects.requireNonNull(null, () -> {return "值为null, Lambda表达式";});
        Objects.requireNonNull(null, () -> "值为null，Lambda表达式省略写法");

    }
}
