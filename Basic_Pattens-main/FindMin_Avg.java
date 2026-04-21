public class FindMin_Avg {
    public static void main(String[] args){
        int arr[] = {34, 67, 23, 89, 45, 12, 78};
        int min = arr[0];
        int count =0 ;
        double  sum = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            count++;//double avg = sum / arr.length;
            // here no need to write count you can write directly array length

            sum = sum + arr[i];

        }
        double avg = (sum)/count;

        System.out.println("the average of the array :" + avg);

        System.out.println("Minimumm number : " + min);
    }
}
