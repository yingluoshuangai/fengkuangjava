package cs_10.c_04;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/9/19
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 自定义异常类
 * 1. 自定义异常类需要继承Exception或RuntimeException
 * 2. 通常提供两个构造器，一个无参构造器，一个带一个字符串参数的构造器
 */
public class AuctionException extends Exception{

    public AuctionException(){};

    //通过调用父类构造器，可以将此字符串参数传给异常对象的message属性，message属性就是该异常对象的详细描述信息
    public AuctionException(String msg){
        super(msg);
    }
}
