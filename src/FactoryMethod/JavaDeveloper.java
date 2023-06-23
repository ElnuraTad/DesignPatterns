package FactoryMethod;

public class JavaDeveloper implements Developer{
    public void writeJavaCode() {
        System.out.println("Java developer write java code");
    }

    @Override
    public void writeCode() {
        System.out.println("Java developer");

    }
}
