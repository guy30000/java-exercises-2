package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Mars_Exploration {
    // Complete the marsExploration function below.
    static int marsExploration(String s) {
    char[] charString = s.toCharArray();
    int errorCount =0;
    for (int i=0;i<charString.length;i++) {
        if ((((i+1)%3 == 0 || (i+1)%3 == 1) && charString[i] == 'S') ||
        ((i+1)%3 == 2) && charString[i] == 'O')continue;
        else errorCount++;
    }
    return errorCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = "SOSSPSSQSSOR";

        int result = marsExploration(s);



        scanner.close();
    }
}
