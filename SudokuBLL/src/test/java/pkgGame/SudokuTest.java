package pkgGame;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

import pkgHelper.LatinSquare;
import pkgGame.Sudoku;

public class SudokuTest {
	
	@Test
	public void getRegionA1() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		int[] myRegion = {1,2,2,3};
		Sudoku s = new Sudoku(myArray);		
		assertTrue(Arrays.equals(s.getRegion(0), myRegion));
	}
	
	@Test
	public void getRegionA2() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		int[] myRegion = {3,4,4,1};
		Sudoku s = new Sudoku(myArray);		
		assertTrue(Arrays.equals(s.getRegion(2), myRegion));
	}
	
	@Test
	public void getRegionA3() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		Sudoku s = new Sudoku(myArray);		
		assertNull(s.getRegion(5));
	}
	
	@Test
	public void getRegionB1() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		int[] myRegion = {1,2,2,3};
		Sudoku s = new Sudoku(myArray);
		
		assertTrue(Arrays.equals(s.getRegion(1, 0), myRegion));
	}
	
	@Test
	public void getRegionB2() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		int[] myRegion = {1,2,2,3};
		Sudoku s = new Sudoku(myArray);		
		assertTrue(Arrays.equals(s.getRegion(2, 3), myRegion));
	}
	
	@Test
	public void getRegionB3() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		Sudoku s = new Sudoku(myArray);		
		assertNull(s.getRegion(5,0));
	}
	
	@Test
	public void getRegionB4() throws Exception
	{
		int[][] myArray = { {1,2,3,4}, {2,3,4,1}, {3,4,1,2}, {4,1,2,3} };
		Sudoku s = new Sudoku(myArray);		
		assertNull(s.getRegion(0,4));
	}
	
	@Test
	public void setRegionTest() throws Exception
	{
		int[][] myArray = { {0,0,0,0}, {0,0,0,0}, {0,0,0,0}, {0,0,0,0} };
		Sudoku s = new Sudoku(myArray);
		int[][] finalArray = { {0,0,0,0}, {0,0,0,0}, {0,0,1,2}, {0,0,3,4} };
		s.setRegion(3);
		assertTrue(Arrays.deepEquals(s.getPuzzle(), finalArray));
	}
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
}
