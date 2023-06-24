package creational.Builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Visit card");
    }

    @Override
    void buildCsm() {
        website.setCms(Csm.WORDPRESS);

    }

    @Override
    void buildPrice() {
website.setPrice(1000);
    }


}
