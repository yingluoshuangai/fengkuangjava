package cs_06.c_08;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays.parallelSort(T[] a, Comparator<? super T> cmp) : 是Arrays类用来对集合使用指定排序算法进行排序。
 * Interface Comparator<T> : 是Java8 添加的函数接口，用来对集合进行排序。
 * 根据parallelSort（）方法的参数类型，Lambda表达式知道了实现的是哪个函数式接口，
 */
public class LambdaArrays {
    public static void main(String[] args){
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
    }
}
