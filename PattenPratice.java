public class PattenPratice {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
//We have declared an array of lenght5
        /* We have solved two pattens finding the maxmimun
        element in the array and the average of the array

         */
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            /*
            this loop get updated every time first it will take 5 and it compare
            2 and 5 > 2now the next index element 8 > 5 so the max gets updated .

             */
        }System.out.println("Maxmium :" +max);
        int sum =0;
        for(int num : numbers){
            sum += num;

        }
        double average = (double)sum / numbers.length;
        System.out.println("Average :" +average);
    }
}
