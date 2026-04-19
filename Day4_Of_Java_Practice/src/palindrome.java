import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String original = sc.nextLine();//we want to take the input from the user
        String reversed = "";/*we are creating a another variable to
        store the reverse string*/
        for(int i =original.length()-1;i>=0;i--) {
            /* remember one thing we are reverseing the string here
            so we need the string from the backword
             */
            reversed = reversed + original.charAt(i);
            /* here if the string is "hello" then  the first ilteration will be
                                  o
            then after it will be ol
            then after it will be oll
            then after it will be olle
            then after it will be olleh
            in the last ilteration we will get the complete string
            now in the reversed string variable the reverse string is stored
            so no we need to compare that is this string is same with compare to the original string

             */
        }
        System.out.println(reversed);
        if(reversed.equals(original)){
                /* here we are using .equals() to compare the string
                instred of == for comparing the string .equals()work accuractely
                 */
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome ");
        }
    }
}
