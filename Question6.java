package lab7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    private ArrayList<Integer>  arr;

    public Question6(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void findProperDivisors(int n){
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                this.arr.add(i);
            }
        }
    }

    public boolean isPerfect(int n){
        int     sum = 0;
        for (int i = 0; i < this.arr.size(); i++)
            sum += this.arr.get(i);
        return (sum == n);
    }

    public static void main(String[] args){
        Scanner         input = new Scanner(System.in);
        int             n;
        ArrayList<Integer>  arr = new ArrayList<Integer>();
        Question6       obj = new Question6(arr);

        System.out.println("Enter a positive integer:");
        n = input.nextInt();
        obj.findProperDivisors(n);
        boolean isPerfect = obj.isPerfect(n);
        System.out.println((isPerfect) ? (n + " is a perfect number.") : (n + " is not a perfect number."));
        System.out.println("The proper divisors of " + n + " are: " + obj.getArr());
    }
}
