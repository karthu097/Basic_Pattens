public class Missingnumber {
    public static int main(int[] nums){
        int n = nums.length;

        //Calculate experted sum 0-n
        int expectedSum =n*(n+1)/2;

        int actualSum =0;
        for(int num : nums){
            actualSum += num;

        }return expectedSum - actualSum;

    }
}
