package FactoryMethod;

public class Program {
    public static void main(String[] args) {

//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeJavaCode();

//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCppCode();

//        Developer developer = new JavaDeveloper();
//        developer.writeCode();
//
//        Developer developer1 = new CppDeveloper();
//        developer1.writeCode();

        DeveloperFactory developerFactory = createDeveloperBySpeciality("Php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
//
        DeveloperFactory developerFactory2 = createDeveloperBySpeciality("C++");
        Developer developer2 = developerFactory2.createDeveloper();
        developer2.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String specialty){
        if (specialty.equalsIgnoreCase("Java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("C++")) {
            return new CppDeveloperFactory();
            } else if (specialty.equalsIgnoreCase("Php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty +"is unknown specialty");
            
        }
    }

}
