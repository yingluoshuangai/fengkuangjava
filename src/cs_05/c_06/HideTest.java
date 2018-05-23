package cs_05.c_06;

class Parent{
    public String tag = "龙，天下第一";
}

class Derived extends Parent{
    private String tag = "龙， 天下第二";
}

public class HideTest {
  public static void main(String[] args){
      Derived derived = new Derived();
      System.out.println(((Parent)derived).tag);
  }
}
