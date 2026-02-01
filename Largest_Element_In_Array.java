class Largest_Element_In_Array {
    public static void main(String[] args) {
        int arr[] = {5, 7, 3, 6};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > largest) {
                largest = arr[i-1];
            }

        }
        System.out.println(largest);
    }
}