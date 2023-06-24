package structural.decorator;

public abstract class DeveloperDecorator implements  Developers{

    Developers developers;

    public DeveloperDecorator(Developers developers){
        this.developers = developers;
    }
    @Override
    public String makeJob() {
        return developers.makeJob();
    }
}
