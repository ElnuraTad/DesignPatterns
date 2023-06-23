package FactoryMethod;

public class CppDeveloper implements Developer{

    public void writeCppCode(){
        System.out.println("Cpp developer write cpp code");
    }

    @Override
    public void writeCode() {
        System.out.println("C++ developer");
    }
}
