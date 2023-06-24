package behaviral.itterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Elnura", skills);
        Iterator iterator
                 = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getNamme());
        System.out.println("Skills: ");

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
