public class SecoundLargest {
    public static int SecLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secoundLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            if(current > largest ){
                secoundLargest = largest;
                largest = current ;
            }
            else if (current < largest && current > secoundLargest){
                secoundLargest = current ;
            }
        }
        if(secoundLargest == Integer.MIN_VALUE ){
            return -1;
        }
        return secoundLargest;
    }
    public static void main(String[] args){
        int arr[] = {3,5,4,7};
        System.out.println(SecLargest(arr));
    }
}
