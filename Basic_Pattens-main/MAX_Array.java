public class MAX_Array {
   public static void main(String[] args){
       int arr[] ={32,67,23,89,45,12,78};
       int max = arr[0];
       for(int i =0 ;i<arr.length-1;i++){
           if(max>arr[i-1]){
               max = arr[i];
           }
       }
       System.out.println(max);
   }
}
