package cs_08.c_06;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/9/2
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * Map 的简单使用
 * default V	replace(K key, V value)
 * Replaces the entry for the specified key only if it is currently mapped to some value.
 * 替换这个指定key对应的value，当且仅当这个key目前映射到某个value
 *
 * default V merge(K key,V value,BiFunction<? super V,? super V,? extends V> remappingFunction)
 * If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
 * Otherwise, replaces the associated value with the results of the given remapping function, or removes if the result is null.
 * 如果这个指定key以前没有关联值或者与null关联，将它与给定的non-null值关联。
 * 否则，将这个关联值替换为这个remappinfFunction方法的结果，如果结果为null，则移除这个元素
 *
 *default V computeIfAbsent(K key,Function<? super K,? extends V> mappingFunction)
 * If the specified key is not already associated with a value (or is mapped to null),
 * attempts to compute its value using the given mapping function and enters it into this map unless null.
 * If the function returns null no mapping is recorded. If the function itself throws an (unchecked) exception, the exception is rethrown, and no mapping is recorded.
 * 如果这个指定key以前没有关联值，或关联的是null，
 * 则尝试使用给定的mappingFunction方法计算其值，使这个key关联它，除非计算结果为null
 * 如果计算结果为null，则不记录映射，如果mappinfFunction方法抛出(未检查的)异常，则将这个异常抛出，且不记录这个映射
 *
 * default V computeIfPresent(K key,BiFunction<? super K,? super V,? extends V> remappingFunction)
 * If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
 * If the function returns null, the mapping is removed. If the function itself throws an (unchecked) exception, the exception is rethrown,
 * and the current mapping is left unchanged.
 * 如果这个指定key的值是存在且不为null，尝试使用当前的value值计算出一个新的value值给这个key。
 * 如果这个remapppingFunction方法返回null，则将这个映射移除，如果这个方法抛出一个异常，则将这个异常抛出
 *
 * computeIfAbsent 如果空缺，进行计算
 * computeIfPresent 如果存在，进行计算
 */
public class MapTest2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("皮城执法官", 100);
        map.put("皮城女警", 200);
        map.put("暴走萝莉", 300);
        System.out.println(map);

        map.replace("暴走萝莉", 500);
        System.out.println(map);

        //将皮城执法官的value值加50
        map.merge("皮城执法官", 50, (oldVal, param) -> (Integer)oldVal + (Integer)param);
        System.out.println(map);

        //如果map里没有曙光女神，则创建一个key-value，value值为key的长度
        map.computeIfAbsent("曙光女神", (key) -> ((String)key).length());
        System.out.println(map);

        //将皮城女警的value值加上key的长度
        map.computeIfPresent("皮城女警", (key, oldVal) -> ((String)key).length() + (Integer)oldVal);
        System.out.println(map);
    }
}
