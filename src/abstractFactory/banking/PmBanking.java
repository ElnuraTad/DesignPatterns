package abstractFactory.banking;

import abstractFactory.ProjectManager;

public class PmBanking implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manage code");
    }
}
