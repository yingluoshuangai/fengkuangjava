package cs_06.c_02;

/***
 * 重写equals方法
 */
class Person{
    private String name;
    private String idStr;
    public Person(){}
    public Person(String name, String idStr){
        this.name = name;
        this.idStr = idStr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    //重写equals方法
    public boolean equals(Object obj){
        //如果两个对象为同一个对象
        if(this == obj){
            return true;
        }
        //当obj是Person对象，idStr属性相等
        if(obj != null && obj.getClass() == this.getClass()){
            Person personObj = (Person)obj;
            if(this.getIdStr().equals(personObj.getIdStr())){
                return true;
            }
        }
        return false;
    }
}

public class OverrideEqualsRight {
    public static void main(String[] args){
        Person p1 = new Person("孙悟空","123");
        Person p2 = new Person("齐天大圣", "123");
        Person p3 = new Person("六耳猕猴", "456");
        System.out.println("p1和p2是否相等：" + p1.equals(p2));
        System.out.println("p1和p3是否相等：" + p1.equals(p3));
    }
}
