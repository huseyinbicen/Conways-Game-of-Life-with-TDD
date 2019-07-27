/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaysgameoflife;

/**
 *
 * @author Hus
 */
public class conwaysGameOfLife
{
    public static boolean[][] tempBoard = new boolean[1][1];
    public static boolean[][] ReadFile(){return tempBoard;}
    public static void printBoard(boolean[][] matrix){}
    public static boolean[][] nextGeneration(){return tempBoard;}
    public static boolean rulesOfLife(int numberOfNeighbors, boolean isAlive) {return false;}
    private static int numberOfNeighbors(boolean[][] board, int row, int col) {return 0;}
    private static boolean inBound(boolean[][] board, int row, int col){return false;}
    
}
