package com.company;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        // List <Integer> list = Arrays.stream(ar).boxed().collect(Collectors.toList());
        int matches =0;
        int [] ar2 = ar.clone();

        for (int i =0; i<n; i++){
            boolean found= false;
            int p=i+1;
            while(!found && p <n)
            {
                if((ar2[i]!= 0 || ar2[p]!= 0) && (ar2[i] == ar2[p])){

                    ar2[i]=0;
                    ar2[p]=0;
                    found = true;
                    matches++;
                }
                p++;
            }
        }
        return matches;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}