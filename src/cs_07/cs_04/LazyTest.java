package cs_07.cs_04;

import java.util.Calendar;

/**
 * @Author: AT
 * @Date: 2018/7/17
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 set方法 的延迟修改
 * set方法修改的并不会立即生效，而是直到下次调用get(), getTime(), getTimeInMillis(), add(),roll()时，才生效。在这期间进行的修改会一次性全部生效
 */
public class LazyTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 7, 31);
        calendar.set(Calendar.MONTH, 8);
//        System.out.println(calendar.getTime());//2017-10-1，因为2017-9-31是非法的，所以自动调节为2017-10-1
        calendar.set(Calendar.DATE, 5);
        System.out.println(calendar.getTime());//2018-9-5, 因为延迟修改，他会同时修改月份为9和日期为5，而9月5号是合法的。
    }
}
