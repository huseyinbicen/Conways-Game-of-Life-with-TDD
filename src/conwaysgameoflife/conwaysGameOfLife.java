/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaysgameoflife;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Hus
 */
public class conwaysGameOfLife
{
    public boolean[][] tempBoard = new boolean[1][1];
    
    public boolean[][] ReadFile() throws FileNotFoundException{
        Scanner inputfile;
        boolean[][] arr = new boolean[10][10];
        File file = new File("board.txt");
	inputfile = new Scanner(file);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
            	arr[i][j] = isTrue4ReadFile(inputfile);
            }
        }
        return arr;
    }
    public void printBoard(boolean[][] board)
    {
        String cell = "";
        for(boolean[] i : board){
            for(boolean val : i)
                if(val)
                    cell += "1 ";
                else
                    cell += "0 ";
            cell += "\n";
        }
        System.out.println(cell);
    }
    
    public boolean[][] nextGeneration(){
        return tempBoard;
    }
    
    public boolean rulesOfLife(int numberOfNeighbors, boolean isAlive) {
        return (isAlive && (numberOfNeighbors == 2 || numberOfNeighbors == 3)) || (!isAlive && numberOfNeighbors == 3);
    }
    
    public int numberOfNeighbors(boolean[][] board, int row, int col) {
        return 0;
    }
    
    
    public boolean inBound(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
    
    
    
    private boolean isTrue4ReadFile(Scanner inputfile)
    {
        return inputfile.hasNextInt() && inputfile.nextInt() != 0;
    }
    
}
