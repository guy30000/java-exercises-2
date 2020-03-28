package exercises.hackerrank.Array_Play;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Equalize_the_Array {

    static int equalizeArray(int[] arr) {
        int highCount = 1;
        int currentCount=1;
        Arrays.sort(arr);

        for (int i = 0;i<arr.length-1;i++){
            if (arr[i] == arr[i+1]){
                currentCount++;
                if (currentCount > highCount){
                    highCount = currentCount;
                }
            } else {
                currentCount =1;
            }
        }
        int deletions = arr.length-highCount;


    System.out.println(arr.length + "-" +deletions);
    return deletions;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 3;


//        String[] arrItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            int arrItem = Integer.parseInt(arrItems[i]);
//            arr[i] = arrItem;
//        }

        int result = equalizeArray(arr);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}