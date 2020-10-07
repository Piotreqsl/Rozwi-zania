package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class two {
	
	
	static Boolean isRowSymmetrical(String[] splited) {
	    int i = 159;
	    int j = 160;
	    while(i!=0 && j!=320) {
	        if(splited[i]!=splited[j])
	            return false;
	        i--; j++;
	    }
	    return true;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2017\\txt\\dane.txt");
		Scanner scanner = new Scanner(file);
		
		String[] table = new String[200]; 
		int index=0;
		

		
		while(scanner.hasNextLine())
		{
			table[index] = scanner.nextLine();
			index++;
		}
		
		int cursor = 0;
		
		
		
		
		for(int j =0; j < table.length; j++) {
			
			String[] splited = table[j].split(" ");
			System.out.println(Arrays.toString(splited));
			
			if(!isRowSymmetrical(splited)) cursor++;
		}
		System.out.println(cursor);
		
		
	
	}

}
