//package com.PrashantJAVApractice;

import java.io.*;

public class Main {
       static int[][] dp1 = new int[51][51];
    static {
        for(int i = 1 ; i < 51 ; i++){
            for(int j = 1 ; j < 51 ;j++){
                dp1[i][j] = gcd(i,j);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int size = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] a = new int[size + 1];
        for(int i = 1  ; i <= size ; i++)
            a[i] = Integer.parseInt(line[i - 1]);

        giveSolution(a, size);
    }

    static void giveSolution(int[] a, int size){
        StringBuilder sb = new StringBuilder();
        int[][] prefix ;
        int[][] suffix ;
        int ans,pre = Integer.MAX_VALUE ,post = Integer.MAX_VALUE;
        prefix = prefixIndexes(a, size);
        suffix = suffixIndexes(a, size);

        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, minimum = Integer.MAX_VALUE;
        for(int i = 1 ; i <= size ; i++){
            ans = -1;minimum = Integer.MAX_VALUE;
            for(int j = 1 ; j <= 50 ; j++){
                if(dp1[a[i]][j] == 1) {
                    if (prefix[j][i] > 0 && minimum > Math.abs(prefix[j][i] - i)) {
                        ans = prefix[j][i];
                        minimum = Math.abs(prefix[j][i] - i);
                    }
                    if (suffix[j][i] > 0 && minimum >= Math.abs(suffix[j][i] - i)) {
                        ans = suffix[j][i];
                        minimum = Math.abs(suffix[j][i] - i);
                    }

                }
            }

            sb.append(ans+" ");
        }

        System.out.println(sb);
    }

    static int gcd(int a , int b){
        if(a == b)
            return a;
        if(a%b == 0)
            return b;
        if(b%a == 0)
            return a;
        if(a > b)
            return gcd(a-b, b);
        return gcd(b-a, a);
    }

   


    static int[][] suffixIndexes(int[] a, int size){
        int[][] holder = new int[51][size + 1];
        int val = -1;
        for(int i = 1 ; i < 51 ; i++){
            val = -1;
            for(int j = 1; j <= size ; j++){
                if(a[j] == i)
                    val = j;
                holder[i][j] = val;
            }
        }
        return holder;
    }


    static int[][] prefixIndexes(int[] a, int size){
        int[][] holder = new int[51][size + 1];
        int val = -1;
        for(int i = 1 ; i < 51 ; i++){
            val = -1;
            for(int j = size; j > 0 ; j--){
                if(a[j] == i)
                    val = j;
                holder[i][j] = val;
            }
        }
        return holder;
    }
}
