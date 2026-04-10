import java.util.HashSet;
public class FindDuplicate {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        HashSet<Integer> seen = new HashSet<>();
        for(int n : numbers){
            if(seen.contains(n)) {
                System.out.println("Duplicate found :" + n);
            }
            seen.add(n);
        }
    }
}
