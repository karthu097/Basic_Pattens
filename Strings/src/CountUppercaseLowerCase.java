
public class CountUppercaseLowerCase {
    public static void main(String[] args) {
        String str = "Hello World Java";
        int Uppercase = 0;                     // ✅ counter declared outside
        int Lowercase = 0;                     // ✅ counter declared outside
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                Uppercase++;                   // ✅ increments ONLY when uppercase
            } else if (Character.isLowerCase(ch)) {
                Lowercase++;                   // ✅ increments ONLY when lowercase
            }
            // spaces automatically skipped ✅
        }
        System.out.println("Lowercase: " + Lowercase);  // ✅ outside loop
        System.out.println("Uppercase: " + Uppercase);  // ✅ outside loop
        }
    }
    /*
    * ```

public class CountUppercaseLowerCase {
    public static void main(String[] args){
        String str = "Hello World Java";
        int  Uppercase =0;
        int Lowercase =0;
        for(int i =0;i<str.length();i++){

            char ch = str.charAt(i);
            System.out.print(str.charAt(i)+" ");
            if( Character.isUpperCase(ch)) {
                Uppercase++;

            }else if(Character.isLowerCase(ch)) {
                Lowercase++;

            }
            System.out.print(" ");
        }
        System.out.println("Lowercase : " + Lowercase);

        System.out.println("Uppercase : " + Uppercase);
    }
}
```*/
