

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one {

    public static String alphabet = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

    public static void main(String[] args) {


        File file = new File("C:\\Users\\user\\Desktop\\Maturka\\Informatyka\\Rozwiązania\\2016\\txt\\dane_6_2.txt");
        Scanner scanner = null;


        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while(scanner.hasNextLine()){
            String scanned = scanner.nextLine();
            String string = scanned.split(" ")[0];
            int key = Integer.parseInt(scanned.split(" ")[1]);



            StringBuilder stringBuilder = new StringBuilder();

            for(int i =0; i< string.length(); i++ ) {
                int index = alphabet.indexOf(string.charAt(i)) - key;
                System.out.println(index);
                System.out.println(index/alphabet.length() * alphabet.length());
                if (index < 0) index = index - (int) (index/alphabet.length() -1) * alphabet.length() ;


                stringBuilder.append(alphabet.charAt(index));


            }


            System.out.println(stringBuilder.toString());
        }



    }

}