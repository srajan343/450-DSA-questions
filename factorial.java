import java.util.*;
public class factorial {
    


	public static int fact(int n ){
		if(n==0){
			return 1;
		}
			int f = fact(n-1);
			return n*f;
		}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if(a<0){
			System.out.println("Error"); 
		}
		else{
			System.out.println(fact(a));
		}
	}
}

