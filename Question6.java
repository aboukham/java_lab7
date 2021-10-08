package lab7;

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public static ArrayList<Integer> findProperDivisors(int n){
        ArrayList<Integer>  arr = new ArrayList<Integer>();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                arr.add(i);
            }
        }
        return arr;
    }

    public static boolean isPerfect(int n, ArrayList<Integer> arr){
        int     sum = 0;
        for (int i = 0; i < arr.size(); i++)
            sum += arr.get(i);
        return (sum == n);
    }

    public static void main(String[] args){
        Scanner             input = new Scanner(System.in);
        int                 n;
        ArrayList<Integer>  arr;

        System.out.println("Enter a positive integer:");
        n = input.nextInt();
        arr = findProperDivisors(n);
        boolean isPerfect = isPerfect(n, arr);
        System.out.println((isPerfect) ? (n + " is a perfect number.") : (n + " is not a perfect number."));
        System.out.println("The proper divisors of " + n + " are: " + arr);
    }
}
