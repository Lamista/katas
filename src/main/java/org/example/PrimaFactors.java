package org.example;

import java.util.ArrayList;
import java.util.List;

public class PrimaFactors {
    private static final List<Integer> primes = new ArrayList<>();

    public static List<Integer> getPrimesOf(int number) {
        List<Integer> resultList = new ArrayList<>();
        if (number >= 2) {
            for (int i = 2; i <= number; i++) {
                if (isPrime(i)) {
                    if (number % i == 0) {
                        while (number % i == 0) {
                            number = number / i;
                            resultList.add(i);
                        }
                    }
                }
            }
        }
        return resultList;
    }

    private static boolean isPrime(int i) {
        if (primes.contains(i)) {
            return true;
        }
        for (int prime : primes) {
            if (i % prime == 0) {
                return false;
            }
        }
        primes.add(i);
        return true;
    }
}
