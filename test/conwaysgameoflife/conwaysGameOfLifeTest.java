/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conwaysgameoflife;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hus
 */
public class conwaysGameOfLifeTest
{
    
    public conwaysGameOfLifeTest()
    {
    }

    /**
     * Test of ReadFile method, of class conwaysGameOfLife.
     */
    @Test
    public void testReadFile() throws FileNotFoundException
    {
        Scanner inputfile;
        boolean[][] arr = new boolean[10][10];
        File file = new File("board.txt");
	inputfile = new Scanner(file);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
            	if (inputfile.hasNextInt() && inputfile.nextInt() != 0)    
            	{
            		arr[i][j] = true;
            	}
            }
        }
        
        boolean[][] expected = new conwaysGameOfLife().ReadFile();
        
        assertArrayEquals(expected, arr);
        fail("The File is not found");

    }

    /**
     * Test of printBoard method, of class conwaysGameOfLife.
     */
    @Test
    public void testPrintBoard()
    {
    }

    /**
     * Test of nextGeneration method, of class conwaysGameOfLife.
     */
    @Test
    public void testNextGeneration()
    {
    }

    /**
     * Test of rulesOfLife method, of class conwaysGameOfLife.
     */
    @Test
    public void testRulesOfLife()
    {
    }
    
}