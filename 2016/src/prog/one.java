package prog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one {

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

    public static void main(String[] args) {


        File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2016\\txt\\dane_6_1.txt");
        Scanner scanner = null;


        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while(scanner.hasNextLine()){
            String string = scanner.nextLine();
            int key = 107;
            StringBuilder stringBuilder = new StringBuilder();

            for(int i =0; i< string.length(); i++ ) {
                int index = alphabet.indexOf(string.charAt(i)) + key;
                if (index > alphabet.length()) index = index - (int) index/alphabet.length() * alphabet.length();


                stringBuilder.append(alphabet.charAt(index));


            }


            System.out.println(stringBuilder.toString());
        }



    }

}