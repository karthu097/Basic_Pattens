package Day_8;

public class DuplicateBF {
    public static void main(String[] args){
                int arr[] ={4,5,7,9,4,33};
                for(int i=0; i<arr.length; i++){
                    for(int j=i+1; j<arr.length; j++){
                        if(arr[i] == arr[j]){
                            System.out.println(arr[i] + " duplicate");
                        }
                    }
                }
            }
        }