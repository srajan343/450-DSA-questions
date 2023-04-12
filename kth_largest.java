import java.util.Arrays;

public class kth_largest {
    public static void main(String[] args) {
        int[] arr = {1,2,5,7,8,6};
        System.out.println(k_largest(arr, 2));
    }
    public static int k_largest(int[] arr , int n){
        Arrays.sort(arr);
        int a= arr.length-1;
        return arr[a-n+1];
    }
}
