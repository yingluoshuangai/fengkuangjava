package cs_06.c_04;

/***
 * 不可变类
 * 包含引用类型变量时的处理
 */
public class Person {
    private final Name name;
    public Person(Name name){
        //通过复制对象到内部，避免引用的对象改变，导致不可变类的改变
        this.name = new Name(name.getFirstName(), name.getLastName());
    }
    public Name getName(){
        return name;
    }

    public static void main(String[] args){
        Name n = new Name("孙", "悟空");
        Person p = new Person(n);
        n.setLastName("大圣");
        System.out.println(p.getName().getLastName());
    }

}
class Name{
    private String firstName;//姓
    private String lastName;//名
    public Name(){}
    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
