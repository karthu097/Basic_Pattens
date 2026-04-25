package NestedLoopa;

public class SimpleTriangle {
    public static void main(String[] args){
        int rows = 3;
        int clos = 6;
        for(int i =1;i<=rows;i++) {
            for (int j = 1; j <= clos; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        class Triangle  {
            int rows = 5;
            for(int  i =1;i<=rows;i++){
                for(int j = 1;j<=i;j++){
                    System.out.println( );
                }
            }

        }

    }
}
