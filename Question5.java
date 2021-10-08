package lab7;

import java.util.Scanner;

public class Question5 {
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i <= (n / 2); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input;
        int n;
        int count;

        count = 0;
        input = new Scanner(System.in);
        System.out.println("Enter an integer greater than 2.");
        n = input.nextInt();
        for (int i = 2; i <= n; i++)
            if (isPrime(i))
                count++;
        System.out.println("the number of primes between 2 and " + n + " is " + count);
    }
}
