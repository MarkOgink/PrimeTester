package nl.han.oose.dea;

public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 2000;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();
    }

    private void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        PrimeTester tester1 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
        PrimeTester tester2 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
        PrimeTester tester3 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);
        PrimeTester tester4 = new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST);

        tester1.run();
        tester2.run();
        tester3.run();
        tester4.run();

    }
}
