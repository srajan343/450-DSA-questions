public class reverse_array {
   static void reverse(int[] arr , int first , int last ){
    int temp;
    while(first<last){
        temp = arr[first];
        arr[first]= arr[last];
        arr[last] = temp;
        first++;
        last--;
    }
   }

   static void print(int arr[] , int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
   }


   public static void main(String[] args) {
    int arr[] = {1,2,3};
   print(arr, 3);
    reverse(arr, 0, 2);
    print(arr, 3);
   }
}
