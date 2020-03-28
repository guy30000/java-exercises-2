package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRank_in_a_String {
    static String hackerrankInString(String s) {
        char[] hckerankString = "hackerrank".toCharArray();
        char[] sChars = s.toCharArray();
        int sIa = 0;

        for (int i = 0; i < hckerankString.length; i++) {
            boolean foundChar = false;
            for (int sIb = sIa; sIb < sChars.length; sIb++) {
                //System.out.println(hckerankString[i] + " " + sChars[sIb]);
                if (hckerankString[i] == sChars[sIb]){
                    sIa = sIb+1;
                    foundChar = true;
                    //System.out.println("FOUND---" + hckerankString[i] + " " + sChars[sIb]);
                    break;
                }
            }
            if (foundChar == false) {
                //System.out.println("NO find");
                return "NO";
            }

        }
//System.out.println("yes find");
return "YES";
    }

    public static void main(String[] args) throws IOException {
            String s = "hackerworld";
            String result = hackerrankInString(s);
    }
}
