import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 5, 7};
        HashSet<Integer> set = new HashSet<>();
        //using hash set
//        hash set never contains duplicate values
        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate: " + num);
            } else {
                set.add(num);
                }
            }
        //brute force
                for (int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] == arr[j]) {
                            System.out.println("using brute force :"+arr[i]);
                        }


                    }
                }
            }
        }




