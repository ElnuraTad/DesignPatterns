package abstractFactory.website;

import abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester testing code");
    }
}
