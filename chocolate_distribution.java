import java.util.Arrays;

public class chocolate_distribution {
  static int min_diff(int arr[], int n,int m){
    if(m==0 || n==0){
        return 0;
    }
    Arrays.sort(arr);
    if(n<m){
        return -1;
    }

    int md = Integer.MAX_VALUE;
    for(int i=0; i+m-1<n;i++){
        int diff = arr[i+m-1] - arr[i];
        if(diff<md){
            md = diff;
        }
    }

    return md;
  }  

  public static void main(String[] args) {
    int arr[] = {7,3,1,4,9,12,56};
    int m = 3;
    int n = arr.length;
    System.out.println(min_diff(arr, n, m));
  }
}
