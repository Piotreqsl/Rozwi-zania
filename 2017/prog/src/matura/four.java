package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class four {
	
	public static void longest(int[][] data) {
		
		int[] kolumhy = new int[320];
		
		for(int column =0; column < 320; column++){
			int longestInCol = 1;
			int currentLong = 1;
			for(int row = 1; row < 200; row++) {
				if(data[row][column] == data[row- 1][column]) {
					currentLong++;
				}
				else {
					if(currentLong > longestInCol) longestInCol = currentLong;
					currentLong = 1;
				}	
			}
			
			if(currentLong > longestInCol) longestInCol = currentLong;
			
			kolumhy[column] = longestInCol;
			
			
		}
		Arrays.sort(kolumhy);
		
		System.out.println(Arrays.toString(kolumhy));
		
	}
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2017\\txt\\dane.txt");
		Scanner scanner = new Scanner(file);
		
		int[][] table = new int[200][320];
		
		int up = 0;
		
		while(scanner.hasNextLine())
		{
			String lineString = scanner.nextLine();
			String[] splited = lineString.split(" ");
			
			for (int i =0; i < splited.length; i++) {
				table[up][i] = Integer.parseInt(splited[i]);
			}
			
			up++;	
		}
		
		
		
		longest(table);
		

	}
}
