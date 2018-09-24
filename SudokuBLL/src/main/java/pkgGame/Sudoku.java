package pkgGame;

import java.lang.Math;
import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare
{
	
	private int iSize;
	private int iSqrtSize;
	
	private int[][] ls;

	public Sudoku(int iSize) throws Exception {

		if (Math.sqrt(iSize) == (int) Math.sqrt(iSize)) {
			this.iSize = iSize;
			this.iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new Exception("size must be a perfect square");

	}

	public Sudoku(int[][] puzzle) throws Exception {

		super(puzzle);

		if (puzzle.length == (int) Math.sqrt(puzzle.length) * Math.sqrt(puzzle.length)) {
			this.iSize = puzzle.length;
			this.iSqrtSize = (int) Math.sqrt(iSize);
		} else
			throw new Exception("size must be a perfect square");
	}
	
	public int[][] getPuzzle(){
		return super.getLatinSquare();
	}

	
	public int[] getRegion(int r)
	{
		if (r >= iSize)
			return null;
		int [][] myPuzzle = getPuzzle();
		int[] region = new int[iSize];
		int CRange = r % iSqrtSize;
		int RRange = r / iSqrtSize;
		int place = 0;
		for(int Col = iSqrtSize*CRange; Col < iSqrtSize*(CRange + 1); Col++)
		{
			for(int Row = iSqrtSize*RRange; Row < iSqrtSize*(RRange + 1); Row++)
			{
				region[place] = myPuzzle[Col][Row];
				place++;
			}
		}
		return region;
	}
	
	public int[] getRegion(int iCol, int iRow)
	{
		if(iCol >= iSize || iRow >= iSize)
			return null;
		int RegionCol = iCol / iSqrtSize;
		int RegionRow = iRow / iSqrtSize;
		int region = RegionCol + (iSqrtSize * RegionRow);
		return getRegion(region);
	}
	

}


















