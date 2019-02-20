package nl.han.oose.dea;

import nl.han.oose.dea.NumberUnderTest;
import org.apache.commons.math3.primes.Primes;

public class PrimeTester implements Runnable {

    NumberUnderTest numberUnderTest;
    int highestNumberToTest;

    public PrimeTester(NumberUnderTest numberUnderTest, int highestNumberToTest) {
        this.numberUnderTest = numberUnderTest;
        this.highestNumberToTest = highestNumberToTest;
    }

    public void startTesting() {

        while (true) {

            int number = numberUnderTest.getNumber();

            if (number > highestNumberToTest) {
                break;
            }

            boolean isPrime = Primes.isPrime(number);

            if (isPrime) {
                System.out.println(Thread.currentThread().getId() + " found a prime number: " + number);
            }
        }
    }

    public void run() {
        try {
            startTesting();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
