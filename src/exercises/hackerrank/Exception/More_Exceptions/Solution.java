package exercises.hackerrank.Exception.More_Exceptions;
import java.util.*;
import java.io.*;

import java.util.Scanner;




class Solution{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

//            int n = in.nextInt();
//            int p = in.nextInt();
            int n = -1;
            int p = -2;
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}