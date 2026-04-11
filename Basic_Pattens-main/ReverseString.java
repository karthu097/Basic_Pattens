import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String orginal = sc.nextLine();
        String reversed = "";
        for (int i = orginal.length() - 1; i >= 0; i--) {
            reversed = reversed + orginal.charAt(i);
        }
        System.out.println(reversed);
        if(reversed.equals(orginal)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome ");
        }
/*
* reversed.equals(original)  // ✅ comparing STRING content
reversed == original        // ❌ compares memory address — never do this!

*/
    }

    }
