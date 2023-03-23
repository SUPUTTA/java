package lambdaExpressions;

import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        var N = 5;
        var R = 2*N-1;
        var C = 2*N-1;
        char[][] matrix = new char[R][C];
        for(int row = 0 ; row < R ; row++){
            for(int col = 0 ; col < C  ;col++){
                matrix[row][col] = ' ';
            }
        }
        for(int index = 0 ; index < N ; index++){
            matrix[index][index] = (char)(index+1+'0');
            matrix[index][C-index-1] = (char)(index+1+'0');
            matrix[R-index-1][index] = (char)(index+1+'0');
            matrix[R-index-1][C-index-1] = (char)(index+1+'0');
        }
        for(int row = 0 ; row < R ; row++){
            for(int col = 0 ; col < C  ;col++){
                System.out.print(matrix[row][col]);
            }
            System.out.print("\n");
        }
    }
}
