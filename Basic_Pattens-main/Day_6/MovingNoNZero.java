package Day_6;

public class MovingNoNZero {
    public static void main(String[] args) {

        int[] arr = {1, 6, 2, 8, 3};
        int j = 0; //we need to create a pointer to compare
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  == 6) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
    }


