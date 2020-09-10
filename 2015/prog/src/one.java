import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one {



    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2015\\txt\\liczby.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int moreOnes = 0;

        while(scanner.hasNextLine()){
            String string = scanner.nextLine();
            int ones = 0;
            int zeros = 0;

            for (var i =0; i< string.length(); i++){
                if(string.charAt(i) == '0') zeros++;
                else ones++;
            }

            if (zeros > ones) moreOnes++;
        }

        System.out.println(moreOnes);

    }
}
