package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developers developers) {
        super(developers);
    }

    public String sendWeekReport(){
        return "Send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
