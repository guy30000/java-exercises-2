package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Pangrams {

    static String pangrams(String s) {
        char[] charString = s.toCharArray();
        Arrays.sort(charString);
        int foundChar = 0;

        for (int i = foundChar; i<26;i++){
            for (char t: charString) {
                //System.out.print(t + " --- " + (int)t+ " - ");
                System.out.println(t + " " + (int)t + " " + i);
                if ( ((int)t   == 97 + i)) {
                    System.out.println(((int)t + i) + "  " + (char)(t + i) + " found " + i +" "+ ((int)t + i) + "  " + (97 + i));
                    continue;
                    //break;
                }
            }
        }
// ((int)t + i  == 65 + i) ||
return "thing";
    }



    public static void main(String[] args) throws IOException {

        String s = " abc";

        String result = pangrams(s);

    }
}
