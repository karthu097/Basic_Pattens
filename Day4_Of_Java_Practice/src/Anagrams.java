public class Anagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "sileot";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram ❌");
            return;
        }

        boolean isAnagram = true;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (str2.indexOf(ch) == -1) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram ✅");
        } else {
            System.out.println("Not Anagram ❌");
        }
    }
}