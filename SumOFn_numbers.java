import java.util.Scanner;
public class SumOFn_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
/*there are two ways for finding the sum of n natural numbers
one is throught the looping
for(int i =1;i<=n;i++){
sum = sum + i;
}
and another one throught formula same as below  one
 */
        int sum =n*(n+1)/2;

        System.out.println("Sum="+sum);
    }
}
