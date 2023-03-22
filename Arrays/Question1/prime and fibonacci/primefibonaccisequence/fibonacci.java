package primefibonaccisequence;
   public class fibonacci{
    public static void generateFibonacci(int n) {
        int first = 0;
        int second = 1;
        int next = 0;
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }}

