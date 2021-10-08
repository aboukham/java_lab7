package lab7;

import java.util.Scanner;

public class Question1 {
    //1. Identify all the errors in the following repitition statements:
    public static void main(String[] args){
      //a
        for (int i = 10; i > 0; i++) {
            x = y;
            a = b;
        }
        //the condition is always true because i is always greater than 0. that result an infinite loop.
        //this error is a logical error.

        //b.
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        do{
            num = scanner.nextInt();
            sum += num;
        }until(sum > 10000);
        //do-until is not a loop, that is a syntactical error.

        //c.
        while (x < 1 && x > 10){
            a = b;
        }
        //the condition is always false so, even though x take any value, all statements
        // inside the loop never execute. This is a logical error.

        //d.
        while (a == b){
            a = b;
            x = y;
        }
        //if the condition is true at the first time, this loop will be infinite,
        // because the condition will be always true. This is a logical error.
    }
}
