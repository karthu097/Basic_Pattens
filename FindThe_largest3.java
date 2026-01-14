import java.util.Scanner;

public class FindThe_largest3 {
    public static void main(String[] args){
        System.out.println("Enter the three numbers :");
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int largest =0;
        if(A>B && A>C){
            largest =A;
        }else if(B>A && B>C){
            largest =B;
        }else{
            largest =C;
        }
        System.out.println("THis numbers is the largest among three :" +largest);
    }
}
