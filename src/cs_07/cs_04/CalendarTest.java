package cs_07.cs_04;

import java.util.Calendar;

import static java.util.Calendar.YEAR;

/**
 * @Author: AT
 * @Date: 2018/7/15
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 calendar 类
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//获得当前时间
        //得到年
        System.out.println(calendar.get(YEAR));
        //得到月
        System.out.println(calendar.get(Calendar.MONTH));//因为Calendar的月份是从0开始的，所以要相应的加减一
        //得到日
        System.out.println(calendar.get(Calendar.DATE));
        //设置年月日分秒
        calendar.set(2017, 6, 25, 9, 27, 30);
        System.out.println(calendar.getTime());
        //将calendar的年份向前推1年
        calendar.add(YEAR, -1);
        System.out.println(calendar.getTime());
        //将calendar的月向前推8个月
        calendar.roll(Calendar.MONTH, -8);
        System.out.println(calendar.getTime());



    }
}
