package cs_06.c_08;

/**
 * Lambda表达式重写了函数式接口的抽象方法。
 * Lambda表达式返回的是实现了函数式接口的匿名内部类的实例对象。
 * Lambda表达式省略的写法，只有一个参数，省略括号，只有一行代码，省略中括号，return也可省略，如果Lambda表达式需要返回值，会自动将这唯一一行代码的值返回。
 * Lambda表达式中“引用特定对象的实例方法”和“引用某类对象的实例方法”的区别：
 * 如果调用方法是实例方法，且没有给出调用者，则默认把第一个参数作为调用者。
 */
public class MethodRefer {
    public static void main(String[] args){
        //①引用类方法 TODO
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

        //②引用特定对象的实例方法 TODO
        //Converter converter1 = (from) -> {return "AT,niubi".indexOf(from);};//完整写法
        //Converter converter1 = from -> "AT,niubi".indexOf(from);//省略写法
        //函数式接口中被实现方法的全部参数传给该方法作为参数
        Converter converter1 = "At,niubi"::indexOf;//方法引用的写法
        Integer val1 = converter1.convert("ni");
        System.out.println(val1);

        //③引用每类对象的实例方法 TODO
        //匿名内部类写法
        MyTest myTest = new MyTest(){
            public String test(String a, int b, int c){
                return a.substring(b, c);
            }
        };
        String str = myTest.test("AT very very nb", 2, 9);
        System.out.println(str);
        //Lambda表达式完整写法
        MyTest myTest1 = (a, b, c) -> {return a.substring(b,c);};
        String str1 = myTest1.test("AT very very nb", 2, 9);
        System.out.println(str1);
        //方法引用的写法
        MyTest myTest2 = String :: substring;//函数式接口中被实现方法的第一个参数作为调用者，后面的参数全部传给该方法作为参数
        String str2 = myTest2.test("AT very very nb", 2, 9);
        System.out.println(str2);



    }
}

/**
 * 函数式接口
 */
@FunctionalInterface
interface Converter{
     Integer convert(String from);

}
@FunctionalInterface
interface MyTest{
    String test(String a, int b, int c);
}
