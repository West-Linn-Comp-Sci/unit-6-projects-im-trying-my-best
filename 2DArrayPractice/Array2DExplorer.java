
/**
 * Write a description of class Array2DExplorer here.
 *
 * @author Liam Groah
 * @version 5/16/21
 */
public class Array2DExplorer
{
    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        Array2DExplorer exp = new Array2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();

        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRow(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }


    public boolean evenRow(int [][] mat, int row){
        for(int i = 0; i < mat[row].length; i++) {
            if(mat[row][i] % 2 != 0)
            return false;
        }
        return true;
    }
    public boolean oddColSum(int[][] nums, int col)
    {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i][col];
        }
        if(sum % 2 != 0)
            return true;
        else
            return false;
    }
    public int minRow(int[][] nums, int row){
        int min = nums[row][0];
        for(int i = 0; i < nums[row].length; i++) {
            if(nums[row][i] < min)
            min = nums[row][i];
        }
        return min;
    }
    public int[] colMaxs(int[][] matrix){ 
        int[] newArray = new int[matrix[0].length];
        int max;
        for(int i = 0; i < matrix[0].length; i++){
            max = 0;
            for(int j = 0; j < matrix.length; j++){
                if (matrix[j][i] > max)
                    max = matrix[j][i];
                } 
            newArray[i] = max;
            }
        return newArray;
    }
    public int[] allRowSums(int[][] data){
        int[] sumArray = new int[data.length];
        int sum;
        for(int i = 0; i < data.length; i++){
            sum = 0;
            for(int j = 0; j < data[i].length; j++){
                if (j == (data[i].length-1)){
                    sum += data[i][j];
                    sumArray[i] = sum;
                } else {
                    sum += data[i][j];
                }
            }
        }
        return sumArray;
    }
    public double[] averageCol(int[][] nums){
        double[] average = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++) 
        {
            double max = 0;
            for(int j = 0; j < nums.length; j++)
                max += nums[j][i];
            average[i] = max / nums.length;
        }
        return average;
    }
    public int smallEven(int[][] matrix){
        int min = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] < min && matrix[i][j] % 2 == 0){
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
    public int biggestRow(int[][] nums){
        int max = 0;
        int max2 = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            max = 0;
            for(int j = 0; j < nums[i].length; j++){
                if (j == (nums[i].length-1)){
                    max += nums[i][j];
                    if (max > max2){
                        max2 = max;
                        index = i;
                    }
                } else {
                    max += nums[i][j];
                }
            }
        }
        return index;
    }
}
