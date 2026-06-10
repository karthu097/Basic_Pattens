import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args){
        int[] arr ={1,2,3,2,5,7};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)) {
                System.out.println("Duplicate: " + num);
            }else{
                set.add(num);
            }
        }
    }
}
