
/**
 * Write a description of class ArrayPractice here.
 *
 * @author Liam Groah
 * @version 5/10/21
 */
public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{5, 4, 2, 1, 0}, {523, 63, 2342, 586, 1, 6534, 0}, {10, 9, 2, 0}};
        fixArray(array, 0, array[0].length-1, array[0].length);
        fixArray(array, 1, array[1].length-1, array[1][0] + array[1][array[1].length-2]);
        fixArray(array, 2, array[2].length-1, array.length) ;
        print(array);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void fixArray(int[][] arr, int row, int col, int value)
    {
        for(int i = 0; i <= 3; i++) {
        if(i == 1) {
        row = 0;
        col = 4;
        value = 5;
    }
        if(i == 2) {
        row = 1;
        col = 6;
        value = 7057;
    }
    if(i == 3) {
        row = 2;
        col = 3;
        value = 16;
    }
        arr[row][col] = value;
    }
    }
    
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

