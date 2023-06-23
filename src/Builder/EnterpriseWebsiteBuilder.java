package Builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice website");
    }

    @Override
    void buildCsm() {
        website.setCms(Csm.ALIFRESCO);

    }

    @Override
    void buildPrice() {
        website.setPrice(10000);

    }
}
