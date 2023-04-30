
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to obtain grade");
        int a  = sc.nextInt();
        if(a>10){
            System.out.println("enter number between 1-10");
        }
        else{
            if(a<=10 && a>9){
                System.out.println("S grade");
            }
            else if(a>8 && a<=9){
                System.out.println("A grade");
            }
            else if(a>7 && a<=8){
                System.out.println("B grade");
            }
            else if(a>6 && a<=7){
                System.out.println("C grade");
            }
            else if(a>5 && a<=6){
                System.out.println("D grade");
            }
            else{
                System.out.println("you failed");
            }
        }
            

}
}
