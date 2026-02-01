import java.util.HashMap;

public class Problem2 {
    /*
    frequency hashing (counting)

    we use this patten for Counting how many times the elements appers
    Canonical problem

    Find the element with the highest frequency
    Brute Force : Count again by the loop
     and the time complexity for this one is o(n2)

     THe optimized solution for this one is To use hashMap to store the counts
     */
    public static void main(String[] args){
        int arr[] ={2 , 3,3,5,7};
        HashMap<Integer ,Integer> map = new HashMap<> ();
        for(int x :arr){
            map.put(x,map.getOrDefault(x,0)+1);
            System.out.println(arr);
        }

    }
}
