package Day_8;
import java.util.*;
public class Secoundlargest {
    public static void main(String[] args){
        int arr[] = {12 ,35 ,1 ,10 ,34 ,1};
        int largest = Integer.MIN_VALUE;
        int seclarg =Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++) {

            if (arr[i] > largest) {
                seclarg = largest;
                largest = arr[i];
            }else if(arr[i] > seclarg){
                seclarg = arr[i];
                }
            }
        System.out.println("largest : "+ largest);
        System.out.println("Sec largest : " + seclarg);
        }
    }

