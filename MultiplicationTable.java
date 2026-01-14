import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int Table = n*i;
            System.out.println(n +" x " +i+ "=" +Table);
        }

    }
}
