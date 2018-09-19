package cs_10.c_04;

/**
 * @Author: 亚瑟i拉尼
 * @Date: 2018/9/19
 * @Remark: Down to earth, you can look up at the stars
 * @Description:
 * 测试多个方法协作处理同一个异常
 */
public class AuctionTest {
    private double initPrice = 30.0;
    public void bid(String bidPrice) throws AuctionException{
        double d = 0.0;
        try{
            d = Double.parseDouble(bidPrice);
        }catch(Exception e){
            e.printStackTrace();
            throw new AuctionException("竞拍价必须是数值， 不能包含其他字符");
        }
        if(initPrice > d){
            throw new AuctionException("竞拍价比起拍价低， 不允许竞拍");
        }
        initPrice = d;
    }

    public static void main(String[] args) {
        AuctionTest at = new AuctionTest();

        try{
            at.bid("df");
        }catch(AuctionException e){
            System.err.println(e.getMessage());
        }
    }
}
