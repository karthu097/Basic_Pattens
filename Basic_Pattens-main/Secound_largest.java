public class Secound_largest {
    public static void main(String[] args){
        int arr[] = {34, 67, 23, 89, 45, 12, 78};
        int Small= arr[0];
        int secound_small = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<Small){
                secound_small = Small ;//secound_small in this variable the small is get stored
                Small= arr[i]; // the small variable fix's the small
            }else if(arr[i]<secound_small){
                secound_small = arr[i];
            }
        }
        System.out.println(Small);
        System.out.println(secound_small);
    }
}
