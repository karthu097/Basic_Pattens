package Day_7;

import java.util.*;

public class WamUp {
    public static void main(String[] args) {
        int arr[] = {2,4,9,8};
        int large = 0;
        for (int i = 0; i < arr.length; i++) {
                int sec = large + arr[i];
                if (arr[i] > large) {
                    large = arr[i];

                    }
                }
System.out.println(large);
        }


    }


