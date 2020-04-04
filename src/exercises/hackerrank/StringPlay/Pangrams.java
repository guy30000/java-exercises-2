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
        s = s.toLowerCase();
        char[] charString = s.toCharArray();
        Arrays.sort(charString);


        for (int i = 0; i<26;i++){
            boolean foundChar = false;
            for (char t: charString) {
                //System.out.print(t + " --- " + (int)t+ " - ");
                System.out.println(t + " "+ (97+i)  + " "+ (int)t);
                if (((int)t   == 97 + i)) {
                    System.out.println(( t + " found " + i +" "+ ((int)t ) + "  " + (97 + i)));
                    foundChar = true;
                    //continue;
                    break;
                }
            }
            if (foundChar == false){
                System.out.println("not pangram");
            return "not pangram";}
        }
// ((int)t + i  == 65 + i) ||
        System.out.println("pangram");
return "pangram";
    }

    public static void main(String[] args) throws IOException {
        String s = " We promptly judged antique ivory buckles for the next prize";
        String result = pangrams(s);
    }
}
