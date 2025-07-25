package Ex_16_Arrays;

public class Lab_146_2Dimension {
    public static void main(String[] args) {

        int[][] array_2D_Old ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        } ;

        int[][] predefined = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int [][] array;
        array = new  int[][]{ {10,20} , {30,40} , {50,60}};

        int[][] array_2D = new int[3][3];
        array_2D[0][0] = 2;
        array_2D[0][1] = 3;
        array_2D[0][2] = 4;

        array_2D[1][0] = 5;
        array_2D[1][1] = 6;
        array_2D[1][2] = 7;

        array_2D[2][0] = 8;
        array_2D[2][1] = 9;
        array_2D[2][2] = 10;
    }
}
