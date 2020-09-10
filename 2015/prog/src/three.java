import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class three {


    public static boolean isBigger(String one, String two) {
        if(one.length() > two.length()) return true;
        else if (one.length() < two.length()) return false;
        else {
            for (var i =0; i < one.length(); i++)
            {
                if(one.charAt(i) == '1' && two.charAt(i) == '0') return true;
                if(one.charAt(i) == two.charAt(i) && i != one.length() - 1) continue;
                if(one.charAt(i) == two.charAt(i) && i == one.length() - 1) return false;
                if(one.charAt(i) == '0' && two.charAt(i) == '1') return false;

            }
        }
        return true;
    }
    

    public static void main(String[] args) {

        File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2015\\txt\\liczby.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int index = 2;
        int biggestIndex = 0;
        int smallestIndex = 0;
        String big;
        String small;

        String firString = scanner.nextLine();
        big = firString;
        small = firString;


        while(scanner.hasNextLine()) {
            String string = scanner.nextLine();
            if (isBigger(string, big)) {
                big = string;
                biggestIndex = index;
            }
            if (!isBigger(string, small)) {
                small = string;
                smallestIndex = index;
            }
            index++;
        }


        System.out.println(biggestIndex);
        System.out.println(smallestIndex);

    }
}
