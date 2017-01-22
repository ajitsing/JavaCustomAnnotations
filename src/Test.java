public class Test {
    @MyTest
    public void firstTest() {
        System.out.println("Running first test");
    }

    @MyTest
    public void secondTest() {
        System.out.println("Running 2nd test");
    }

    public void thirdTest() {
        System.out.println("Running 2rd test");
    }

    private void helperMethod() {
        System.out.println("I am helper method");
    }
}
