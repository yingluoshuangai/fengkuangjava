package cs_06.c_09;

/**
 * 性别枚举类
 * 包含实例变量的枚举类处理
 *
 * ① set方法为什么要加判断？
 * 为了保证枚举值为FEMALE的name变量的值只能为“女”，枚举值为MALE的name变量的值只能为“男”，防止枚举值出现混乱
 */
public enum Gender {

    MALE, FEMALE;

    private String name;
    public void setName(String name){
        switch(this){
            case MALE : {
                if(name.equals("男")){
                    this.name = name;
                }else{
                    System.out.println("参数错误");
                    return;
                }
                break;
            }
            case FEMALE : {
                if(name.equals("女")){
                    this.name = name;
                }else{
                    System.out.println("参数错误");
                    return;
                }
                break;
            }
        }
    }
    public String getName(){
        return this.name;
    }
}
