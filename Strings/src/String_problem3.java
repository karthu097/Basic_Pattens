public class String_problem3 {
    public static void main(String[] args){
        String str = "karthu ";
        int count = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
           if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u'){
               count++;

            }
        }
        System.out.println("vowel count: " +count);
        /*
        * Char ch is used to store character in a variable
        * ch=='a' || ch ='e' this check if the characte is any vowel
        * count++ found a vowel - increment counter
        * */
    }
}
