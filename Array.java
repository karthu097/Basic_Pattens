
public class Array{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        } // Loop ends here

        // This must be inside the main method braces
        System.out.print(sum);
    } // Main method ends here
} // Class ends here