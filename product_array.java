// product of array except itself
// input : arr = [1,2,3,4]
// output : product = [24,12,8,6]  



class product_array {
    public static void main(String[] args) {
        int[] arr = {-1,1,0,-3,3};
        prod(arr);
        
    }

    public static int[] prod(int[] arr){

        int n = arr.length;
        if(n==1){
            System.out.println(0);
            return arr;
        }
        
        int [] left = new int[n];
        int [] right = new int[n];
        int [] product = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            left[i] = left[i-1]*arr[i-1];
        }
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]*arr[i+1];
        }

        for(int i=0;i<n;i++){
            product[i]=left[i]*right[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(product[i] + " ");
        }

        return product;

    }
}
