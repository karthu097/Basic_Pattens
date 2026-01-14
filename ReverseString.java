public class ReverseString {
    public static void main(String[] args) {
        String orginal = "hello";
        String reversed = " ";
        for (int i= orginal.length() - 1;i>=0;i--) {
            reversed = reversed + orginal.charAt(i);
        }
        System.out.println(reversed);
    }
}