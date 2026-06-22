package Day_8;
import java.util.*;

public class Duplicates {
    public static void main(String[] args){
        int arr[] ={4,5,7,9,4,33};
         HashSet<Integer> set = new HashSet<>();
         int count =0;
        System.out.print("{ ");
         for(int i =0;i<arr.length;i++){
             if(set.add(arr[i])){
                 System.out.print( arr[i]);
                 count++;
             }else{
                 set.contains(arr[i]);
             }
             System.out.print(" ");
         }
        System.out.println( "} this are the uniqu elements in the array ");
        System.out.println(count);
        }
}
