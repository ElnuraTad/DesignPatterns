package creational.Builder;

public class Website {

    private String name;
    private Csm cms;
    private int price;


    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Csm cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", price=" + price +
                '}';
    }
}
