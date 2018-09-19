package pkgHelper;

import static org.junit.Assert.*;
import java.util.Arrays;


import org.junit.Test;

public class LatinSquareTest {


	@Test
	public void ContainsZeroTest()
	{
		int[][] myArray = { {1,2,3}, {2,3,1}, {3,1,2} };
		LatinSquare ls = new LatinSquare(myArray);
		assertFalse(ls.containsZero());
		
		myArray[0][1] = 0;
		assertTrue(ls.containsZero());
		
	}
	
	@Test
	public void DoesElementExistTest() 
	{
		int[] myArray = {0,1,2,3,4};
		int iValue = 3;
		LatinSquare lq = new LatinSquare();
		assertTrue(lq.DoesElementExist(myArray, iValue));
		
		iValue = 5;
		assertFalse(lq.DoesElementExist(myArray, iValue));
	}

	@Test
	public void hasDuplicatesTest()
	{
		int[] myArr = {0,1,2,3,4};
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.hasDuplicates(myArr));
		
		myArr[3] = 1;
		assertTrue(ls.hasDuplicates(myArr));
		
	}
	
	@Test
	public void hasAllValuesTest()
	{
		int[] arr1 = {0,1,2,3,7};
		int[] arr2 = {7,3,2,1,0};
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasAllValues(arr1, arr2));
		
		arr2[0] = 5;
		assertFalse(ls.hasAllValues(arr1, arr2));
		
		int[] arr3 = {};
		assertFalse(ls.hasAllValues(arr3, arr2));
		
		int[] arr4 = {};
		assertFalse(ls.hasAllValues(arr2, arr4));
	}
	
	@Test
	public void getColumnTest()
	{
		int[][] arr;
		arr = new int[0][0];
		
		LatinSquare ls = new LatinSquare(arr);
		assertNull(ls.getColumn(0));
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
