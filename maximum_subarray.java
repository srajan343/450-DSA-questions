public class maximum_subarray {
    
int maxsubarray(int arr[]){
    int maxsum=0;
    int cursum=0;
    for(int i=0;i<arr.length;i++){
        cursum = cursum + arr[i];
        if(cursum>maxsum){
            cursum = maxsum;
        }
        if(cursum<0){
            cursum = 0;
        }
    }
    return maxsum;
}

}
