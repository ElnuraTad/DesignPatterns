package creational.prototype;

public class VersionControllRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "SuperProject",
                "SourseCode sourceCode = new SourceCode();\n");

        System.out.println(master);

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();
        System.out.println("\n ===========\n");
        System.out.println(masterClone);
    }
}
