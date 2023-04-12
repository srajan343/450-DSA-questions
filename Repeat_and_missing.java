class Repeat_and_missing{
    public static void main(String[] args) {
        int[] arr= {3,2,1,2,5};
        repeated(arr);

    }

    public static int[] repeated(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int abs_val = Math.abs(arr[i]);
            if(arr[abs_val-1]>0){
                arr[abs_val-1] = -arr[abs_val-1];
            }else{
                System.out.println(abs_val);
            }
        }

        for(int i=0; i<n;i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }
        return arr;
    }
}