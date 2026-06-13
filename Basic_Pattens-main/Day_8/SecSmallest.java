package Day_8;

public class SecSmallest {
    public static void main(String[] args){
        int arr[] = {3,46,56,76,45,67};
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i =0 ;i< arr.length;i++){
            if(smallest > arr[i]){
                 smallest = secSmall;
                 arr[i] = smallest;
            }
            if(secSmall > arr[i]){
                arr[i] = secSmall;
            }
        }
        System.out.println(secSmall);
    }
}
