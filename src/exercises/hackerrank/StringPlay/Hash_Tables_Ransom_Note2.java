package exercises.hackerrank.StringPlay;
import java.util.*;


public class Hash_Tables_Ransom_Note2 {
    static void checkMagazine(String[] magazine, String[] note) {
        Arrays.sort(magazine);
        Arrays.sort(note);
        int matchCount = 0;
        String answer = "No";

        for (int i = 0;i<note.length;i++){
            for (int n = 0+i ;n<magazine.length;n++){
                System.out.println(note[i] + " - "+ magazine[n]);
                if (note[i].equals(magazine[n]))      {
                    matchCount++;
                    System.out.println("*match*");
                    break;
                }
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

        String[] magazine = new String[6];
        magazine[0] = "two";
        magazine[1]= "times";
        magazine[2]= "three";
        magazine[3]= "is";
        magazine[4]= "not";
        magazine[5]= "four";


//        String[] magazineItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < m; i++) {
//            String magazineItem = magazineItems[i];
//            magazine[i] = magazineItem;
//        }

        String[] note = new String[5];
        note[0] = "two";
        note[1] = "times";
        note[2] = "two";
        note[3] = "is";
        note[4] = "four";





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
