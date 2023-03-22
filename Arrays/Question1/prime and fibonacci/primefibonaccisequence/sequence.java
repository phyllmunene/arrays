package  primefibonaccisequence;

public class sequence{
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int first = 0;
        int second = 1;
        int next = 0;
        while (next <= limit) {
            next = first + second;
            if (next % 2 == 0) {
                sum += next;
            }
            first = second;
            second = next;
        }
        return sum;
    }}
