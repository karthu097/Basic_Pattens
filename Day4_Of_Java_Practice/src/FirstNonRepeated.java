public class FirstNonRepeated{
    public static void main(String[] args){
        String str = "listen";
        String str2 ="silent";
        int count =0 ; //resets count
        for(int i =0;i<str.length();i++){//for each character

            for(int j =0;j<str2.length();j++){
                /*
                * here the outer loop is for count total no .of letter given in the word

                * inner loop is to compare which letter is not  repeating first

                *Outer loop = points finger at ONE character at a time

                * Inner loop = scans ENTIRE string to COUNT that character

                * If count == 1 = that character is unique → print and stop

                * */
                if(str2.charAt(j) == str.charAt(i)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First Non Repeated :" +str.charAt(i));
                break;// we are using break here because we need only first non repeating letter
            }//stops immediately dv
        }
    }
}