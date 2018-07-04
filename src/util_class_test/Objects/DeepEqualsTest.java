package util_class_test.Objects;

import java.util.Objects;

/**
 * public static boolean deepEquals(Object a,Object b)
 */
public class DeepEqualsTest {
    public static void main(String[] args){
        Student s1 = new Student("储昭著", "22");
        Student s2 = new Student("章鱼", "20");
        Student s3 = new Student("章鱼","24");

        String[] b1 = new String[]{"1", "2", "3"};
        String[] b2 = {"4", "5", "6"};
        String[] b3 = {"1", "2", "3"};

        Boolean result1 = Objects.deepEquals(s1, s2);//调用s1.equals()
        Boolean result2 = Objects.deepEquals(s2, s3);//调用s2.equals()
        Boolean result3 = Objects.deepEquals(null, null);
        Boolean result4 = Objects.deepEquals(b1, b2);//调用 Arrays.deepEquals方法
        Boolean result5 = Objects.deepEquals(b1, b3);//调用 Arrays.deepEquals方法
        Boolean result6 = Objects.deepEquals(s1, b1);//试试一个是Object，一个是Arrays，会怎样处理...调用第一个参数的equals()方法

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }
}
