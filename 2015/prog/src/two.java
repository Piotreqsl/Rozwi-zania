import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class two {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2015\\txt\\liczby.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int twos = 0;
        int eights = 0;

        while(scanner.hasNextLine()){
            String string = scanner.nextLine();
            String sub;

            if(string.length() > 3)
                sub = string.substring(string.length() -3);
            else
                sub = string;

            if(Integer.parseInt(sub) % 2 == 0) twos++;
            if(Integer.parseInt(sub) % 8 == 0) eights++;
        }

        System.out.println(twos);
        System.out.println(eights);

    }
}
