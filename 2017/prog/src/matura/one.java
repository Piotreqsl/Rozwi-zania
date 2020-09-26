package matura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2017\\txt\\dane.txt");
		Scanner scanner = new Scanner(file);
		
		int darkest = 128;
		int lightest = 128;
		
		while(scanner.hasNextLine())
		{
			String lineString = scanner.nextLine();
			String[] splited = lineString.split(" ");
			
			for(String s : splited) {
				int integere = Integer.parseInt(s);
				if(integere < darkest) darkest = integere;
				if(integere > lightest) lightest = integere;
				
			}
			
			
		}
		
		System.out.println(lightest);
		System.out.println(darkest);
	}

}
