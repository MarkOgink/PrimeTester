package nl.han.oose.dea;

public class PrimeTestingApp {

    private static final int HIGHEST_NUMBER_TO_TEST = 2000;

    public static void main(String[] args) {
        PrimeTestingApp app = new PrimeTestingApp();
        app.startTesting();
    }

    private void startTesting() {
        NumberUnderTest numberUnderTest = new NumberUnderTest();

        Thread tester1 = new Thread(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
        Thread tester2 = new Thread(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
        Thread tester3 = new Thread(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));
        Thread tester4 = new Thread(new PrimeTester(numberUnderTest, HIGHEST_NUMBER_TO_TEST));

        tester1.start();
        tester2.start();
        tester3.start();
        tester4.start();

    }
}
