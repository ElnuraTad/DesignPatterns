package abstractFactory.website;

import abstractFactory.Developer;
import abstractFactory.ProjectManager;
import abstractFactory.ProjectTeamFactory;
import abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhPDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
