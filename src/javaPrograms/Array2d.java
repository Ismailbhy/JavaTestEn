package javaPrograms;

public class Array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numberGrid = {
				{1,2,},
				{3,4,5,},
				{6,7,8,9},
				{0}
				
		};
		//System.out.println(numberGrid[1][2]);
		for(int i=0;i<numberGrid.length;i++) {
			
			for(int k=0;k<numberGrid[i].length;k++) {
				System.out.println(numberGrid[i][k]);
			}
			System.out.println();

	}
	}}
