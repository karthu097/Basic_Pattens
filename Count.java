import java.util.Scanner;

public class Count {
    public static void main(String[] agrs) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            if(i%2==0){
                System.out.print("Even");

            }
        }
    }
}
