public class ASDFG {
    public static void main(String[] args){
        int arr[] = {4,6,7,2,9};
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
            if(i==arr.length-1){
                System.out.println("printing the last number using index : "+arr[i]);
            }
        }

    }
}
