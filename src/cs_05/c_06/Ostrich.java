package cs_05.c_06;

public class Ostrich extends Bird{
    public void fly(){
        System.out.println("鸵鸟只能在地上跑...");
    }

    public static void main(String[] args){
        Ostrich ostrich = new Ostrich();
        ostrich.fly();
    }
}
