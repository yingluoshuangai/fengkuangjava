package cs_08.c_05;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/8/18
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 Queue
 *
 * boolean	add(E e)
 * Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions,
 * returning true upon success and throwing an IllegalStateException if no space is currently available.
 * 插入指定元素到Queue中，如果它没有违反容量限制可以立刻执行，如果当前没有空间，则抛出IllegalStateException异常。
 * (将指定元素加入此队列的尾部)
 *
 * E	element()
 * Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
 * 检索，但是不删除，返回这个Queue的头部元素
 *
 * boolean	offer(E e)
 * Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
 * When using a capacity-restricted queue, this method is generally preferable to add(E), which can fail to insert an element only by throwing an exception.
 * 将指定元素插入到Queue中，如果它没有违反容量限制可以立即执行
 * 当使用一个容量限制的Queue时，这个方法通常比add(E)更好，如果插入失败仅仅会抛出一个异常，元素不会插入进去
 *
 * E	peek()
 * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
 * 检索，但是不删除，返回这个Queue的头部元素，如果Queue为空，则返回null
 *
 * E	poll()
 * Retrieves and removes the head of this queue, or returns null if this queue is empty.
 * 检索，且删除这个Queue的头部元素，如果Queue为空，则返回null
 *
 * E	remove()
 * Retrieves and removes the head of this queue.This method differs from poll only in that it throws an exception if this queue is empty.
 * 检索，且删除这个Queue的头部元素，这个方法和poll()方法的不同是，如果Queue为空，它会抛出一个异常
 *
 */
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new PriorityQueue<String>();
        queue.add("数据结构（C语言版）");
        queue.add("程序员的自我修养 链接，装载与库");
        queue.add("Java编程思想");
        queue.offer("鸟哥的Linux私房菜");
        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

    }

}
