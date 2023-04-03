package be.intecbrussel;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Primes {
    static AtomicInteger lastPrime = new AtomicInteger(0);
    public static void main(String[] args) {
        threading();
//        solveOld();
//        solveNew();
        recursie();

    }

    static BigInteger bi = new BigInteger(String.valueOf(1));
    private static void recursie() {
        int limit = 10;
//        int limit = 4;

        for (int i = limit; i >= 1; i--) {
            bi=bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
    }

    private static void factorial(int limit) {
//        bi = bi.multiply(BigInteger.valueOf(limit));
        if (limit > 1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            factorial(limit-1);
        }
    }

    private static void threading() {
        Thread thread = new Thread(() -> {
            while (true){
//                System.out.println(bi);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                }
            }
        });

        thread.setDaemon(true);
        thread.start();
    }

    private static void solveNew() {
//        int primelimit = 2_000_000_000;
        int primelimit = 100_000_000;
        long sum = 0;
        boolean[] array = new boolean[primelimit+1];
        Arrays.fill(array, true);

        for (int i = 2; i <= primelimit && i > 0; i++) {
            if (!array[i]) continue;

            lastPrime.set(i);
            sum+=i;
            for (int j = i+i; j <= primelimit && j > 0; j+=i) {
                array[j] = false;
            }
        }

        System.out.println(sum);
    }

    private static void solveOld() {
        int primelimit = 2_000_000_000;
        long sum = 0;

        loopTillLimit : for (int number = 2; number <= primelimit; number++) {
            boolean isPrime = true;
            loopForOneNumber : for(int divider = 2; divider <= Math.sqrt(number); divider++) {
                if (number%divider == 0) {
                    isPrime = false;
                    break loopForOneNumber;
                }
            }
            if (isPrime) lastPrime.set(number);
            sum += isPrime?number:0;
        }

        System.out.println(sum);
    }
}
