import java.util.Scanner;

public class LinearScan {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 7, 2, 4};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int prefixSum = 0;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];

            if (prefixSum == k) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
