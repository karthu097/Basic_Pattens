public class NonRepeatingChar {
    public static void main(String args[]) {
        //now our main task is to find the charcater which was not repaeting in the word
        // i don't know the approch how to solve this question so i am usin hints
        /* The first hint is to count each and every char in the word */
        String srh = "swiss";
        int count = 0;
        for (int i = 0; i < srh.length(); i++) {
            if (srh.charAt(i) == 's') {
                count++;// here the count becomes 3
            for(int j =0;j<srh.length();i++){
                count++;
                if(srh.charAt(i) == srh.charAt(j)){
                count++;
                }
            }
            }
        }
        System.out.println("if its cont == 1 then found " +count );
    }
}



