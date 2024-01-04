// Maze Problem: You are given a 2D array that represents a maze. 
// It can have 2 values - 0 and 1.1 represents a wall and 0 represents a path.
// The objective is to reach the bottom right corner, i.e, A[A.length-1][A.length-1]. 
// You start fromA[0][0]. You can move in 4 directions - up, down, left and right. 
// Find if a path exists to thebottom right of the maze.
// For example, a path exists in the following maze:

// 0 1 1 1
// 0 1 1 1
// 0 0 0 0
// 1 1 1 0

// time - O(4^(m*n))
// space - O(m*n)

import java.util.Arrays;

public class findPath_25 {
    public enum State{
        UNVISITED,
        VISITED,
        PATH_NOT_FOUND
    }
    public static boolean pathExists(int[][] a){
        if(a == null || a.length == 0){
            return false;
        }
        State[][] memo = new State[a.length][a[0].length];
        for (State[] states: memo){
            Arrays.fill(states, State.UNVISITED);
        }        
        return pathExists(a, 0, 0, memo);
    }
    public static boolean pathExists(int[][] a, int i, int j, State[][] memo){
        if(oob(a, i, j) || a[i][j] == 1){
            return false;
        }
        if(i == a.length - 1 && j == a[0].length - 1){
            return true;
        }
        if(memo[i][j] == State.PATH_NOT_FOUND || memo[i][j] == State.VISITED){
            return false;
        }
        memo[i][j] = State.VISITED;

        int[][] jumps = {{0, 1},{0, -1}, {1, 0}, {-1, 0}};

        for(int[] jump : jumps){
            if(pathExists(a, i + jump[0], j + jump[1], memo)){
                return true;
            }
        }
        memo[i][j] = State.PATH_NOT_FOUND;
        return false;
    }
    public static boolean oob(int[][] a, int i, int j){
        return i < 0 || j < 0 || i >= a.length || j >= a[0].length;
    }
    public static void main(String[] args){
        int[][] maze = {{0,1,0,0,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,1,0,1,0},
                        {0,0,0,1,0}};
        boolean result = pathExists(maze);
        System.out.print(result);
    }
}
