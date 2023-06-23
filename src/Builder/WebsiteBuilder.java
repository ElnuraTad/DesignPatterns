package Builder;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite(){
        website = website;
    }

    abstract void buildName();
    abstract void buildCsm();
    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}

