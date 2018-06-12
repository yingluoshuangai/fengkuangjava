package cs_06.c_08;

/**
 * Lambda表达式重写了函数式接口的抽象方法。
 * Lambda表达式返回的是实现了函数式接口的匿名内部类的实例对象。
 * Lambda表达式省略的写法，只有一个参数，省略括号，只有一行代码，省略中括号，return也可省略，如果Lambda表达式需要返回值，会自动将这唯一一行代码的值返回。
 */
public class MethodRefer {
    public static void main(String[] args){
        //引用类方法
        //Converter converter = new Converter(){//匿名内部类写法
            //public Integer convert(String from){
                //return Integer.valueOf(from);
            //}
        //};
        //Converter converter = (from) -> {return Integer.valueOf(from)};//完整的写法
        //Converter converter = from -> Integer.valueOf(from);//省略的写法，只有一个参数，省略括号，只有一行代码，省略中括号，return也可省略，如果Lambda表达式需要返回值，会自动将这唯一一行代码的值返回。
        Converter converter = Integer::valueOf;//引用的写法

        Integer val = converter.convert("99");//调用
        System.out.println(val);

        //Converter converter1 = (from) -> {return "AT,niubi".indexOf(from);};//完整写法
        //Converter converter1 = from -> "AT,niubi".indexOf(from);//省略写法
        //函数式接口中被实现方法的全部参数传给该方法作为参数
        Converter converter1 = "At,niubi"::indexOf;//方法引用的写法
        Integer val1 = converter1.convert("ni");
        System.out.println(val1);


    }
}

/**
 * 函数式接口
 */
@FunctionalInterface
interface Converter{
     Integer convert(String from);

}
