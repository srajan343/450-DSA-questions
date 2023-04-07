import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Array Size:");
            n=sc.nextInt();
            int[] array = new int[n];
            System.out.print("Enter Array elements: ");
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
        
        Zero_To_End(array);

    }

    public static void Zero_To_End(int[] arr){
        int n = arr.length;
        int temp[] = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }

        while (k<n){
            temp[k]=0;
            k++;
        }
        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
