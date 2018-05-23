package cs_06.c_04;

/***
 * 不可变类
 */
public class Address {
    private final String detail;//详细地址
    private final String postCode;//邮政编码

    public Address(){
        this.detail = "";
        this.postCode = "";
    }
    public Address(String detail, String postCode){
        this.detail = detail;
        this.postCode = postCode;
    }

    public String getDetail() {
        return detail;
    }

    public String getPostCode() {
        return postCode;
    }

    //重写equals（）方法
    public boolean equals(Object obj){
        //如果地址相同
        if(this == obj){
            return true;
        }
        //如果同为一个类
        if(obj != null && this.getClass() == obj.getClass()){
            Address address = (Address)obj;
            //detail与postCode同时相等时，可认为两个对象相等
            if(this.detail.equals(address.detail) && this.postCode.equals(address.postCode)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Address a1 = new Address("上海保定区", "000011");
        Address a2 = new Address("上海保定区", "000011");
        System.out.println("是否相等 ： " + a1.equals(a2));
    }
}
