package main.java;

public class PrimeNumberChecker {
    public static boolean checkIfPrime(int number) {
        if (number <= 1) {
        	//0 or 1 are not prime
            return false;
        }
        //Iterate from 2 to number being checked
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                //Number divisible by another number in this range
            	return false;
            }
        }
        //Otherwise, prime
        return true;
    }
}

