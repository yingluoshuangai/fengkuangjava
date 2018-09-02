package cs_08.c_05;

import java.util.ArrayDeque;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/26
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * Queue 是队列
 * Deque 是它的子接口，代表双端队列
 * ArrayDeque 是Deque的一个实现类
 *
 * 实例，将ArrayDeque当作 栈来使用
 */
public class ArrayDequeStack {
    public static void main(String[] args) {
        ArrayDeque stack = new ArrayDeque();
        stack.push("努努");
        stack.push("EZ");
        stack.push("宝石骑士");

        System.out.println(stack);

        //peek 获得头部元素，但是不删除该元素
        System.out.println(stack.peek());
        System.out.println(stack);
        //pop 出栈
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
