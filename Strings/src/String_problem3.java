public class String_problem3 {
    public static void main(String[] args){
        String str = "hello world";  // has a space now
        int vowelCount = 0;                    // ✅ vowel counter
        int consonantCount = 0;// ✅ consonant counter
        for(int i =0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;                      // ✅ counting vowels
            } else if (ch == ' ') {
                System.out.println(" ");           // ✅ space detected and skipped
            } else {
                consonantCount++;                  // ✅ counting consonants only
            }
        }
        System.out.println("Vowels: " + vowelCount);      // ✅
        System.out.println("Consonants: " + consonantCount); // ✅

        /*
        * Char ch is used to store character in a variable
        * ch=='a' || ch ='e' this check if the characte is any vowel
        * count++ found a vowel - increment counter
        * */
    }
}
