import java.util.Scanner;

public class reverse {
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end)
            return;
        
        // Swapping the elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursively call the function with updated indices
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Array before reversing:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        reverseArray(arr, 0, size - 1);

        System.out.println("\nArray after reversing:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
