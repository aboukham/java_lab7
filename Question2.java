package lab7;

public class Question2 {
    public static void sumNumbers1(){
        int     sum1 = 0;
        int     sum2 = 0;
        int     sum3 = 0;
        int     i;

        for (i = 1; i <= 100; i++)
            sum1 += i;
        i = 0;
        while (++i <= 100)
            sum2 += i;
        i = 1;
        do{
            sum3 += i;
        } while (i++ < 100);

        System.out.println("The sum of numbers from 1 to 100 using for loop sum = " + sum1);
        System.out.println("The sum of numbers from 1 to 100 using while loop sum = " + sum2);
        System.out.println("The sum of numbers from 1 to 100 using do-while loop sum = " + sum3);
    }

    public static void sumNumbers2(){
        int     sum1 = 0;
        int     sum2 = 0;
        int     sum3 = 0;
        int     i;

        for (i = 1; i <= 10; i++)
            sum1 += i * 5;
        i = 0;
        while (++i <= 10)
            sum2 += i * 5;
        i = 1;
        do{
            sum3 += i * 5;
        } while (i++ < 10);

        System.out.println("The sum of numbers which divisible by 5 from 5 to 50 using for loop sum = " + sum1);
        System.out.println("The sum of numbers which divisible by 5 from 5 to 50 using while loop sum = " + sum2);
        System.out.println("The sum of numbers which divisible by 5 from 5 to 50 using do-while loop sum = " + sum3);
    }

    public static void productNumbers1(){
        double     product1 = 1;
        double     product2 = 1;
        double     product3 = 1;
        int        i;

        for (i = 1; i <= 100; i++)
            product1 *= i;
        i = 0;
        while (++i <= 100)
            product2 *= i;
        i = 1;
        do{
            product3 *= i;
        } while (i++ < 100);

        System.out.println("The product of numbers from 1 to 100 using for loop product = " + product1);
        System.out.println("The product of numbers from 1 to 100 using while loop product = " + product2);
        System.out.println("The product of numbers from 1 to 100 using do-while loop product = " + product3);
    }

    public static void productNumbers2(){
        double     product1 = 1;
        double     product2 = 1;
        double     product3 = 1;
        int        i;

        for (i = 1; i <= 10; i++)
            product1 *= 5 * i;
        i = 0;
        while (++i <= 10)
            product2 *= 5 * i;
        i = 1;
        do{
            product3 *= 5 * i;
        } while (i++ < 10);

        System.out.println("The product of numbers which divisible by 5 from 5 to 50 using for loop sum = " + product1);
        System.out.println("The product of numbers which divisible by 5 from 5 to 50 using while loop sum = " + product2);
        System.out.println("The product of numbers which divisible by 5 from 5 to 50 using do-while loop sum = " + product3);
    }

    public static void main(String[] args){
        sumNumbers1();
        System.out.println("*********************************************************************");
        sumNumbers2();
        System.out.println("**********************************************************************");
        productNumbers1();
        System.out.println("*********************************************************************");
        productNumbers2();
    }
}
