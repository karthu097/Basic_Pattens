package NestedLoopa;

public class MovingZero {
    public static void main(String[] args){
        int[] arr = {1,2,3,0,4,0,5};
        int j  = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j]; //swaping the number if the number is not = zero
                arr[j] = temp;
                j++;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }// we use this for each loop only for the traversing
    }
}
