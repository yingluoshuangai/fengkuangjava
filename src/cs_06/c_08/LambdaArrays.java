package cs_06.c_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntToLongFunction;

/**
 * Arrays.parallelSort(T[] a, Comparator<? super T> cmp) : 是Arrays类用来对集合使用指定算法进行排序。
 * Interface Comparator<T> : 是Java8 添加的函数式接口，用来进行比较，返回-1，0，1用来表示第一个参数小于，等于，大于第二个参数。
 * 根据parallelSort（）方法的参数类型，Lambda表达式知道了实现的是哪个函数式接口，
 *  本程序中，是根据字符串长度，进行排序。
 *
 * Arrays.parallelPrefix(int[] array,IntBinaryOperator op): 对数组进行二元迭代，根据数组前后两个元素来计算当前元素的值。
 *  本程序中，是前后两元素相乘，得到当前元素的值。
 *
 *  Arrays.parallelSetAll(long[] array, IntToLongFunction generator) : 根据当前索引来计算当前元素的值。
 *   本程序中，是当前索引乘以5，得到当前元素的值。
 */
public class LambdaArrays {
    public static void main(String[] args){
        //Arrays的parallelSort方法,实现Comparator函数式接口
        //Lambda表达式写法
        String[] arr1 = new String[]{"java", "fkava", "fkit", "ios", "android"};
        Arrays.parallelSort(arr1, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr1));
        //匿名内部类写法
        String[] arr2 = new String[]{"Compares", "two", "notation", "that"};
        Arrays.parallelSort(arr2, new Comparator<String>() {
            public int compare(String o1,String o2){
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(arr2));

        //Arrays的parallelPrefix方法，实现IntBinaryOperator函数式接口
        //Lambda表达式写法
        int[] arr3 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr3, (left, right) -> left * right);
        System.out.println(Arrays.toString(arr3));
        //匿名内部类写法
        int[] arr4 = new int[]{3, -4, 25, 16, 30, 18};
        Arrays.parallelPrefix(arr4, new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left * right;
            }
        });
        System.out.println(Arrays.toString(arr4));

        //Arrays的parallelSetAll方法， 实现IntToLongFunction函数式接口
        //Lambda表达式的写法
        long[] arr5 = new long[5];
        Arrays.parallelSetAll(arr5, operand -> operand * 5);
        System.out.println(Arrays.toString(arr5));
        //匿名内部类写法
        long[] arr6 = new long[6];
        Arrays.parallelSetAll(arr6, new IntToLongFunction(){
            public long applyAsLong(int value){
                return value * 5;
            }
        });
        System.out.println(Arrays.toString(arr6));


    }
}
