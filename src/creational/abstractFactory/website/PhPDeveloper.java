package creational.abstractFactory.website;

import creational.abstractFactory.Developer;

public class PhPDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes code");
    }
}
