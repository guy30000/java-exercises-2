package exercises.hackerrank.Array_Play;

//package src.exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Designer_PDF_Viewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        char[] charactersInString = word.toCharArray();
        int top = 0;
        for ( char character: charactersInString){
            System.out.println(Character.getNumericValue(character));
            if (top < h[(Character.getNumericValue(character)-10)]){
                top = h[(Character.getNumericValue(character)-10)];
            }
        }
        int area = (top)*word.length();



        System.out.println(area);
        return area;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

//        String[] hItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < 26; i++) {
//            int hItem = Integer.parseInt(hItems[i]);
//            h[i] = hItem;
//        }
        h[0] = 1;
        h[1] = 3;
        h[2] = 1;
        h[3] = 3;
        h[4] = 1;
        h[5] = 4;
        h[6] = 1;
        h[7] = 3;
        h[8] = 2;
        h[9] = 5;
        h[10] = 5;
        h[11] = 5;
        h[12] = 5;
        h[13] = 5;
        h[14] = 5;
        h[15] = 5;
        h[16] = 5;
        h[17] = 5;
        h[18] = 5;
        h[19] = 5;
        h[20] = 5;
        h[21] = 5;
        h[22] = 5;
        h[23] = 5;
        h[24] = 5;
        h[25] = 7;


        String word = "zaba";

        int result = designerPdfViewer(h, word);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}