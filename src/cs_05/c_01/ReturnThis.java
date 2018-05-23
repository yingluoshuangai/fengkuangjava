package cs_05.c_01;

public class ReturnThis {
    public int age;//int类型的默认值是0
    public ReturnThis grow(){
        age ++;
        return this;
    }

    public static void main(String[] args){
        ReturnThis rt = new ReturnThis();
        rt.grow().grow().grow();
        System.out.println("rt的age成员变量是:" + rt.age);
    }
}
