import java.util.*;
public class rotationleft {

    static void left(int arr[],int d){
        if(d==0){
            return;
        }
        int n = arr.length;
        d = d%n ;
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }


    public static void reverse(int[] arr , int start , int end){
        
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp ;
            start++;
            end--;
        }
    }

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int d = 2;
        left(arr, d); // 2, 1, 6, 5, 4, 3  => 3 4 5 6 1 2
        printArray(arr);
    }
}
