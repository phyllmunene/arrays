package arrayoperations;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[15];

        // take input from user and store in array
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            arr[i] = input.nextInt();
        }

        // print the values stored in the array
        System.out.println("Values stored in the array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // check if a number is present in the array
        System.out.println("Enter a number to search in the array:");
        int num = input.nextInt();
        boolean found = false;
        int index = -1;
        for (int i = 0; i < 15; i++) {
            if (arr[i] == num) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("The number " + num + " is found at index " + index);
        } else {
            System.out.println("Number not found in this array");
        }

        // create a new array in reverse order and print its elements
        int[] revArr = new int[15];
        for (int i = 0; i < 15; i++) {
            revArr[14 - i] = arr[i];
        }
        System.out.println("Values stored in the reverse order array:");
        for (int i = 0; i < 15; i++) {
            System.out.print(revArr[i] + " ");
        }
        System.out.println();

        // calculate the sum and product of elements in the array
        int sum = 0;
        int product = 1;
        for (int i = 0; i < 15; i++) {
            sum += arr[i];
            product *= arr[i];
        }
        System.out.println("Sum of elements in the array: " + sum);
        System.out.println("Product of elements in the array: " + product);
    }
}