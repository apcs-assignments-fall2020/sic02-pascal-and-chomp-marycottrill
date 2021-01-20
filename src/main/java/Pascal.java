/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal
{
    public static int[][] pascalTriangle(int n) {
        int[][] x= new int[n][n];
        x[0][0] = 1;
        for (int i = 1; i < n; i++){
            x[i][0] = 1;
            x[i][i] = 1; 
        }
        for (int i = 2; i < n; i++){
            for (int j = 1; j < i; j++){
                x[i][j]= x[i-1][j-1] + x[i-1][j];
            }
            x[i][i]= 1;
        }
        return x;
    }
}
