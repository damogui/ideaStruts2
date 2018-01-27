package beans;

/**
 * Created by win on 2018/1/27.
 */
public class Production {

    private int proId;
    private String proName;
    private String proDesc;
    private String proPrice;


    public Production(int proId, String proName, String proDesc, String proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proDesc = proDesc;
        this.proPrice = proPrice;
    }

    public Production() {
    }

    @Override
    public String toString() {
        return "Production{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proDesc='" + proDesc + '\'' +
                ", proPrice='" + proPrice + '\'' +
                '}';
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public String getProPrice() {
        return proPrice;
    }

    public void setProPrice(String proPrice) {
        this.proPrice = proPrice;
    }

    public String save( ) {

        System.out.println("result:" + this);


        return "detail";
    }
}