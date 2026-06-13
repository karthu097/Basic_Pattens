package Day_8;
import java.util.*;

public class Duplicates {
    public static void main(String[] args){
        int arr[] ={4,5,7,9,4,33};
         HashSet<Integer> set = new HashSet<>();
         for(int i =0;i<arr.length;i++){
             if(set.contains(arr[i])){
                 System.out.println(arr[i] + " is  the duplicate in the array  ");
             }else{
                 set.add(arr[i]);
             }
         }
        }
}
