package cs_08.c_02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @Author: AT
 * @Date: 2018/7/22
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试 集合的基类之一 Collection
 */
public class CollectionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();//Collection是抽象类，所以用它的子类ArrayList，来测试Collection类的各个方法的用法

        //boolean add(E e) 添加元素
        c.add("卢本伟");
        c.add("牛逼");
        c.add(84);//集合是不能放基本类型的，但是Java支持自动装箱

        //int size() 返回集合容量
        System.out.println("集合的容量是 ： " + c.size());
        //boolean isEmpty() 判断集合是否为空
        System.out.println("集合是否为空 ： " + c.isEmpty());
        System.out.println("判断集合是否包含”卢本伟“ ： " + c.contains("卢本伟"));
        c.add(null);
        System.out.println("判断集合有没有null元素 ： " + c.contains(null) + c.size());
        //Object[] toArray()
        //Object[] a = c.toArray( new String[0]);//报错，不知道为为什么
        //System.out.println("集合转数组： " + a.toString());

        //boolean remove(Object o)
        System.out.println("集合中删除84 ： " + c.remove(84));
        System.out.println(c.toString());


        //boolean addAll(Collection<? extends E> c)
        //boolean containsAll(Collection<?> c)
        Collection c2 = new HashSet();
        c2.add("恶灵附身2");
        c2.add("给卢老爷上香");
        System.out.println("集合是否包含 ： " + c.containsAll(c2));
        c.addAll(c2);
        System.out.println("集合相加 : " + c.toString());
        System.out.println("集合是否包含 ： " + c.containsAll(c2));
        //boolean removeAll(Collection<?> c)
        System.out.println(c.removeAll(c2));
        System.out.println("集合相减 ： " + c.toString());

        //default boolean removeIf(Predicate<? super E> filter)
        //如果元素满足条件，则删除
        Collection<String> c3 = new ArrayList<>();
        c3.add("小萝莉");
        c3.add("御姐");
        c3.add("人妻");
        System.out.println("集合删除前： " + c3.toString());
        //匿名内部类写法
//        c3.removeIf(new Predicate() {
//            @Override
//            public boolean test(Object o) {
//                return o.toString().equals("小萝莉");
//            }
//        });
//        c3.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equals("小萝莉");
//            }
//        });
        //Lambda表达式写法
        //c3.removeIf((String o) -> {return o.equals("小萝莉");});
        //c3.removeIf((o) -> {return o.equals("小萝莉");});//省略形参类型，范式，list传过来什么类型，就是什么类型
        c3.removeIf(o -> o.equals("小萝莉"));
        System.out.println("集合删除后: " + c3.toString());

        // boolean retainAll(Collection<?> c) : 得到两个集合的交集
        Collection<String> c4 = new ArrayList<>();
        c4.add("小萝莉");
        c4.add("御姐");
        c4.add("人妻");
        System.out.println("c4集合" + c4.toString());
        Collection<String> c4_1 = new ArrayList<>();
        c4_1.add("御姐");
        c4_1.add("人妻");
        System.out.println("c4_1集合" + c4_1.toString());
        c4.retainAll(c4_1);
        System.out.println("ratainAll, 获得两个集合的交集：" + c4.toString());

        //default void forEach(Consumer<? super T> action)  : 遍历集合
        Collection<String> c5 = new ArrayList<>();
        c5.add("小萝莉");
        c5.add("御姐");
        c5.add("人妻");
        c5.forEach(obj -> System.out.println(obj));//Lambda
        System.out.println("匿名内部类写法：");
        c5.forEach(new Consumer<String>(){
            public void accept(String obj){
                System.out.println(obj);
            }
        });

    }

    private static void removeIfTest() {
        //List<String> list = Lists.newArrayList("1","12","13","14","15","0");
        List<String> list = new ArrayList<>();
        System.out.println("初始时："+ list.toString());
        list.removeIf(s -> s.contains("1"));
        System.out.println("过滤完：" + list.toString());
    }
}
