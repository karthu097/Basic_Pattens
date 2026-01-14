import java.util.Scanner;

public class SimpleCalculator {
    public static void main (String[] agrs){
        System.out.println("Simple calc Simple to use ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        double num1 = sc.nextDouble();
        System.out.println("You entered :" +num1);

        System.out.println("Enter the Secound number :");
        double num2 = sc.nextDouble();
        System.out.println("Entered number" +num2);

        //GET the operation
        System.out.println("Choose operations :");
        System.out.println("1.Add");
        System.out.println("2.Sub");
        System.out.println("3.Multiply");
        System.out.println("4.modulus");
        System.out.println("5 divide:");
        System.out.println("Squareroot");
        int choice = sc.nextInt();

        double result = 0;
        String operation ="";

        switch(choice){
            case 1:
                result  = num1 +num2;
                operation = "+";
                break;
            case 2:
                result = num1 - num2;
                operation ="-";
                break;
            case 3:
                result = num1*num2;
                operation ="*";
                break;
            case 4:
                result =num1%num2;
                operation ="%";
                break;
            case 5:
                if(num2 !=0) {
                    result = num1 / num2;
                    operation = "/";
                }else{
                    System.out.println("Error cannot divide by zero");
                    return;
                }break;
            default:
                System.out.println("Invalid choice!");
                return;
        }
        System.out.println(num1 + " " +operation + " " + num2 + "=" + result);

    }
}
