package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Weighted_Uniform_Strings {

    static String[] weightedUniformStrings(String s, int[] queries) {
        String result[] = new String[queries.length];
        ArrayList<Integer> listA= new ArrayList<Integer>();
        char [] charString = s.toCharArray();
        boolean charStringLong = false;
        int charStringTemp = 0;
        listA.add((int)charString[0] - 96);

        for (int i = 1; i<s.length();i++){
            if (charStringLong = false){
                int consecTemp=charString[i-1];
            }
            if (charString[i]==charString[i-1]){
                charStringTemp = (charStringTemp) + (charString[i] -96);
                charStringLong = true;
                listA.add(charStringTemp);
            } else {
                charStringTemp = (int)charString[i] - 96;
                charStringLong = false;
                listA.add((int)charString[i] - 96);
            }
        }


        for (int i = 0; i<queries.length;i++){
            for (int j = 0;j<listA.size();j++){
                //System.out.println(queries[i] + " " + listA.get(j));
                if (queries[i]==listA.get(j)){
                    result[i] = "Yes";
                    break;
                } else result[i]="No";
            }
        }
    return result;
}
///
    public static void main(String[] args) throws IOException {

        String s = "abccddde";

        int queriesCount = 6;

        int[] queries = new int[queriesCount];
        queries[0] = 1;
        queries[1] = 3;
        queries[2] = 12;
        queries[3] = 5;
        queries[4] = 9;
        queries[5] = 10;



        String[] result = weightedUniformStrings(s, queries);



    }
}
