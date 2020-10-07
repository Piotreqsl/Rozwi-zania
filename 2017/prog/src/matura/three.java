package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class three {
	
	static int counter = 0;
	
	public static Boolean isPixelContrasting(int pix1, int pix2) {
		if(Math.abs(pix1 - pix2) > 128) {counter++; return true;}
		return false;
	}
	
	public static int countContrastingPixels(int data[][]) {
	    int contrastingPixels = 0;
	    for(int i = 0;i<200;i++) {
	        for(int j = 0;j<320;j++) {
	            if(i>0 && isPixelContrasting(data[i-1][j],data[i][j])) {
	                contrastingPixels++;
	            }
	            else if(i<199 && isPixelContrasting(data[i+1][j],data[i][j])) {
	                contrastingPixels++;
	            }
	            else if(j>0 && isPixelContrasting(data[i][j-1],data[i][j])) {
	                contrastingPixels++;
	            }
	            else if(j<319 && isPixelContrasting(data[i][j+1],data[i][j])) {
	                contrastingPixels++;
	            }
	        }
	    }
	    return contrastingPixels;
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
		
		
		System.out.println(countContrastingPixels(table));
		
		

	}

}
