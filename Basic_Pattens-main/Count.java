import java.util.Scanner;

public class Count {
    public static void main(String[] agrs) {
        System.out.println("Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;//here we are using the count variable to count the no . of times the loop is repeating

        for (int i = 0; i <= n; i++) {
            System.out.println(i);
            if(i%2==0){ // this is to  check the given number is even , if it is even then it will count .
                System.out.print("Even");

            }
        }
    }
}
