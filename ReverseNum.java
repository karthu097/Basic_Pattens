import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
      System.out.println("Enter the number");
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int reversed =0;
      int orginal =n;

      while(n != 0 ){
          int digit = n % 10;
          /*
          with this we will get the last digit
          as a reminder
           */
          reversed = reversed*10 +digit;
          /*
          every digit is added after getting reversed
          at index 0 = (0*10)+digit
           */
          n =n/10;
          /*
          this removes the last digit and swap the number
           */
      }
      System.out.println(reversed);
    }
}
