package lab7;

import java.util.Scanner;

public class Question4 {
    public static boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i <= (n / 2); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner     input;
        int         num;

        input = new Scanner(System.in);
        while (true){
            System.out.println("Enter an integer");
            num = input.nextInt();
            if (num < 0)
                break;
            if (isPrime(num))
                System.out.println("Prime");
            else
                System.out.println("Not Prime");
        }
    }
}
