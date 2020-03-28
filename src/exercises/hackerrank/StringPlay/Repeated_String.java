package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Repeated_String {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] charArray = s.toCharArray();
        int aCount=0;
        int rCount=0;
        int rCompare=0;
        long iterations = n / s.length();
        long leftOver = n % s.length();

        for (char character: charArray){
            if (character-'a'==0 )  {
                aCount++;
                if(rCompare<=leftOver-1) {
                    rCount++;
                }
            }
            rCompare++;
        }

long result = (iterations*aCount+rCount);

return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = scanner.nextLine();
//
//        long n = scanner.nextLong();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString("aba", 10);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}

