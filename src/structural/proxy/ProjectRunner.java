package structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project
                 = new ProxyProject("https://www.github.com/elnuratad/realproject");
        project.run();
    }
}
