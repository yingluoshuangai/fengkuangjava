package util_class_test.String.String;

/**
 * @Author: AT
 * @Date: 2018/7/12
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 ： public int compareTo(String anotherString) 比较字符串
 */
public class CompareToTest {
    public static void main(String[] args){
        String s1 = "abcdefg";
        String s2 = "abcdafg";
        String s3 = "abcdefghijklmn";
        System.out.println("a".codePointAt(0));
        System.out.println("e".codePointAt(0));
        System.out.println(s1.compareTo(s2));//返回'e' - 'a'的差
        System.out.println(s1.compareTo(s3));//返回长度差

    }
}
