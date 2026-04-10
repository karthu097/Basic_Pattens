public class BasicArrayPattens {
    public static void main(String[] args){
        int arr[] ={32, 67, 23, 89, 45, 12, 78};
        int max = arr[0]; // assume first index is the biggest
        for(int i =0 ;i<arr.length;i++){
            if(arr[i] > max){ //if  you found soething bigger
                max = arr[i]; //then update it
            }
        }
        System.out.println(max);
    }

}
/*  assume that */