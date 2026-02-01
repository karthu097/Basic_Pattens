
public class Linera_Scan_Problem1 {
    public static void main(String[] args) {
        int arr[] ={5 , 6 ,7 ,8 ,74,977};
        int max = arr[0];
        for(int i  = 1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}