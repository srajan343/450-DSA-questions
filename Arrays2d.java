public class Arrays2d {
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int [][] arr = new int[row][col];
        int val = 1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = val;
                val++;
            }
        }
        System.out.println("2d array is: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
