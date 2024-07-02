package Contest;
import java.util.*;
public class nQueen2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int grid[][] = new int[n][n];
        int count = answer(n-1, grid, 0 , 0);
        System.out.println(count);
    }
    public static int answer(int q, int [][]grid, int r, int count){
        if(q == 0){
            return count + 1;
        }
        if(r == grid.length){
            return count;
        }
        for(int i = r; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(isPossible(grid, i, j)){
                    grid[i][j] = 1;
                    count = answer(q-1, grid, i + 1, count);
                    grid[i][j] = 0;
                }
            }
        }
        return count;
    }
    public static boolean isPossible(int grid[][], int r, int c){
        for(int i = 0; i < grid.length; i++){
            if(grid[i][c] == 1)
            return false;
        }
        int left = Math.min(r, c);
        for(int i = 1; i <= left; i++){
            if(grid[r - i][c - i] == 1)
            return false;
        }
        int right = Math.min(r, grid.length - c - 1);
        for(int i = 1; i <= right; i++){
            if(grid[r - i][c + i] == 1)
            return false;
        }
        return true;
    }
}