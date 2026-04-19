import java.util.Scanner;

public class CountingNoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the sentance :");

        String str = sc.nextLine();
        int count = 0;
        String reversed = "";
        for (int i = str.length()-1; i >=0; i--) {
            reversed = reversed + str.charAt(i);

            if (str.charAt(i) == ' ') {
                count++;
            }
            System.out.println(reversed);
        }
        System.out.println("The total number of words : " + (count + 1));

    }
}
