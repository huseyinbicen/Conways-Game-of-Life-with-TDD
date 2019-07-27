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
    
    public boolean[][] nextGeneration(boolean[][] board){
        boolean[][] nextGenerationOfBoard = new boolean[board.length][board[0].length];
    	int numberOfNeig;
        
    	for (int i = 0; i < board.length; i++)
    	{
            for (int j = 0; j < board[0].length; j++)
            {
                numberOfNeig = numberOfNeighbors(board, i, j);
                nextGenerationOfBoard[i][j] = isTrue4NextGeneration(numberOfNeig,board[i][j]);
    		
            }
    	}
    	return nextGenerationOfBoard;
    }
    
    public boolean rulesOfLife(int numberOfNeighbors, boolean isAlive) {
        return (isAlive && (numberOfNeighbors == 2 || numberOfNeighbors == 3)) || (!isAlive && numberOfNeighbors == 3);
    }
    
    public int numberOfNeighbors(boolean[][] board, int row, int col) {
        int deadOrAlive = board[row][col] ? -1 : 0;
        for(int i = row - 1; i <= row + 1; i++)
        {
            for(int j = col - 1; j <= col + 1; j++)
            {
                if( inBound(board, i, j) && board[i][j] )
                {
                	deadOrAlive++;
                }
            }
        }

        return deadOrAlive;
    }
    
    
    public boolean inBound(boolean[][] board, int row, int col){
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
    
    
    
    private boolean isTrue4ReadFile(Scanner inputfile)
    {
        return inputfile.hasNextInt() && inputfile.nextInt() != 0;
    }
    
    private boolean isTrue4NextGeneration(int numberOfNeighbors, boolean isAlive)
    {
        return rulesOfLife(numberOfNeighbors, isAlive);
    }
    
}
