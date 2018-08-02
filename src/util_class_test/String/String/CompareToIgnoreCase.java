package util_class_test.String.String;

/**
 * @Author: AT
 * @Date: 2018/7/14
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 public int compareToIgnoreCase(String str) ，比较字符串，不考虑大小写
 */
public class CompareToIgnoreCase {
    public static void main(String[] args){
        String s1 = "abcdef";
        String s2 = "abcDEF";
        System.out.println(s1.charAt(3) + "的Unicode:" + s1.codePointAt(3));
        System.out.println(s2.charAt(3) + "的Unicode：" + s2.codePointAt(3));
        System.out.println(s1.compareToIgnoreCase(s2));//不考虑大小写，相等，返回0
        System.out.println(s1.compareTo(s2));//d的Unicode编码 减去 D的Unicode编码
    }
}
