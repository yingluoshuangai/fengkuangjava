package util_class_test.String.String;

/**
 * @Author: AT
 * @Date: 2018/7/8
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 public int codePointAt(int index)
 */
public class CodePointAtTest {
    public static void main(String[] args){
        String s1 = "😂";//在utf-32中它是一个字符。但是java使用的是utf-16，所以在Java中他是用两个char保存中。通过使用codePointCount方法可以判断它究竟是一个字符，还是两个字符。
        for(int i = 0; i < s1.length(); i++){
            try{
                System.out.println(s1.charAt(i) + "的Unicode码为" + s1.codePointAt(i));
            }catch(IndexOutOfBoundsException e){
                System.out.println("索引值为负数，或大于字符串长度");
            }
        }
        System.out.println(s1.codePointAt(1));
        //System.out.println(s1.codePointBefore(3));
        System.out.println(s1.codePointCount(1, 2));
    }
}
