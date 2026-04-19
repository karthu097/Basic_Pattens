public class Anagrams{
    public static void main(String[] args){
        String str1 = "listen";
        String str2 = "silent";

        /*
        for the anagram we need to check the both strings
        are equal or not so that no we need to write a if condition
         */

        // we declare boolean outside so it can be used everywhere in the program
        boolean isAnagram = true; // intially we are setting this value is set to be  true

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return; // stop execution if lengths are not equal
        }

        /*
        for checking each character we use a for loop
         */

        // instead of repeating code for each index (0,1,2,3...), we use a loop
        for (int i = 0; i < str1.length(); i++) {

            // picking each character one by one from str1
            char ch = str1.charAt(i);

            int count1 = 0; //counting the number of chacters in the first string
            int count2 = 0;//counting the letters in the seound string

            // loop to count how many times ch appears in str1
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == ch)
                    count1++;
            }

            // loop to count how many times ch appears in str2
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == ch)
                    count2++;
            }

            // comparing both counts
            if (count1 != count2) {
                isAnagram = false; // if mismatch found, it is not an anagram
                break; // no need to check further characters
            }
        }

        // final result based on boolean value
        if(isAnagram){
            System.out.println("Anagram ✅");
        } else {
            System.out.println("Not Anagram ❌");
        }
    }
} /*String basics — charAt, length🌟🌟🌟 Strong
Loop through String🌟🌟🌟 Strong
Reverse a String🌟🌟🌟 Strong
Palindrome check🌟🌟🌟 Strong
Count vowels/consonants🌟🌟🌟 Strong
Count uppercase/lowercase🌟🌟🌟 Strong
First non-repeated character🌟🌟 Growing
Anagram check🌟🌟🌟 Strong*/

