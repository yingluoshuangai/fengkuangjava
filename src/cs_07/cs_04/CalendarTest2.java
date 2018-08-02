package cs_07.cs_04;

import java.util.Calendar;

/**
 * @Author: AT
 * @Date: 2018/7/15
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * add方法和roll方法的区别
 * add方法会自动向上进位，
 * roll方法不会向上进位，但是他们对下一级字段的处理是相同的
 */
public class CalendarTest2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2017, 7, 23, 0, 0, 0);
        //当修改的字段超出它允许的范围时，会发生进位
        calendar.add(Calendar.MONTH, 6); //2017-07-23 --> 2018-01-23
        System.out.println(calendar.getTime());

        //2017-8-31 --> 2018-2-31
        //前面的年份发生进位，由 2017 --> 2018
        //没有 2018-2-31,所以可以向上变为 2018-3-1,向下 2018-2-28, 因为变成2-28，只需要变日，月份不需要改变
        calendar.set(2017, 7, 31, 0,0,0);//代表2017-8-31,因为calendar中月份是从0开始
        calendar.add(Calendar.MONTH, 6); //2017-8-31 --> 2018-2-28
        System.out.println(calendar.getTime());

        //忘记了calendar的月份是从0开始的，
        //结果测试2017-8-31 ,加6个月份，结果一直是2018-4-1
        //原来calendar.set(2017,8,31,0,0,0);设置的是2017-9-31，但是9月没有31号，所以自动向上转型变成2018-10-1，结果加上6个月份，结果自然是2018-4-1
        calendar.set(2017,8,31,0,0,0);//2017-10-1
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, 6); //2017-10-1 --> 2018-4-1
        System.out.println(calendar.getTime());


        calendar.set(2017, 7, 23, 0, 0, 0);
        calendar.roll(Calendar.MONTH, 6);//2017-08-23 --> 2017-02-23
        System.out.println(calendar.getTime());
        calendar.set(2017, 7,31, 0, 0, 0);
        calendar.roll(Calendar.MONTH, 6);//2017-08-31 --> 2017-02-28
        System.out.println(calendar.getTime());

    }
}
