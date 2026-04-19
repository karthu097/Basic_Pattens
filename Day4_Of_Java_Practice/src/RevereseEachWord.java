public class RevereseEachWord {
    public static void main(String[] args){
        String  sentance = "Hello World Java";
        String[] words = sentance.split(" ");
        for(int i =0;i<words.length;i++){
            String word = words[i];
            String reversed = "";

            for(int j=word.length()-1;j>=0;j--){
                reversed = reversed + word.charAt(j);
            }
            System.out.print(reversed+" ");
        }
    }
}
