package exercises.hackerrank.StringPlay;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Hash_Tables_Ransom_Note {
    // Complete the checkMagazine function below.
    //Added a check to see if anythng is skipped. I think I could have done this better

    static void checkMagazine(String[] magazine, String[] note) {
        int matchCount = 0;
        int thisMatch = 0;
        String answer = "No";


    for (int i = 0;i<note.length;i++){
        thisMatch++;
        for (int n = 0;n<magazine.length;n++){
            if (note[i].equals(magazine[n]))      {
                matchCount++;
                magazine[n]="";
                break;
            }
        } if (thisMatch!=matchCount){
            break;
        }
    }


        if (matchCount>=note.length){answer="Yes";}
        System.out.println(answer);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] mn = scanner.nextLine().split(" ");

//        int m = Integer.parseInt(mn[0]);
//
//        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[17];
        magazine[0] = "avtq";
        magazine[1]= "ekpvq";
        magazine[2]= "z";
        magazine[3]= "rdvzf";
        magazine[4]= "m";
        magazine[5]= "zu";
        magazine[6]= "bof";
        magazine[7]= "pfkzl";
        magazine[8]= "ekpvq";
        magazine[9]= "pfkzl";
        magazine[10]= "bof";
        magazine[11]= "zu";
        magazine[12]= "ekpvq";
        magazine[13]= "ekpvq";
        magazine[14]= "ekpvq";
        magazine[15]= "ekpvq";
        magazine[16]= "z";

//        String[] magazineItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < m; i++) {
//            String magazineItem = magazineItems[i];
//            magazine[i] = magazineItem;
//        }

        String[] note = new String[15];
        note[0] = "m";
        note[1] = "z";
        note[2] = "z";
        note[3] = "avtq";
        note[4] = "zu";
        note[5] = "bof";
        note[6] = "pfkzl";
        note[7] = "pfkzl";
        note[8] = "pfkzl";
        note[9] = "rdvzf";
        note[10] = "rdvzf";
        note[11] = "avtq";
        note[12] = "ekpvq";
        note[13] = "rdvzf";
        note[14] = "avtq";



//        String[] noteItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            String noteItem = noteItems[i];
//            note[i] = noteItem;
//        }
//
        checkMagazine(magazine, note);
//
//        scanner.close();
    }
}