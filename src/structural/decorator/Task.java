package structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developers developers = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developers.makeJob());
    }
}
