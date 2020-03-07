package ua.nure.parkhatskyi.task1;

import java.util.Arrays;

public class Part8 {
    public static int[][] pascal(int n){
        int arr[][] = new int[n][];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1];
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for(int i = 2; i < arr.length; i++){
            for(int j = 1; j < arr[i].length - 1; j++){
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int arr[][] = pascal(n);
        String strings[] = new String[n];
        String a = arr[n - 1][n - 1] + "";
        for(int i = 1; i < n; i++){
            a += (" " + arr[n - 1][i]);
        }
        strings[n - 1] = a;
        for(int i = 0; i < n - 1; i++){
            String b = "";
            for(int j = 0; j < arr[i].length; j++){
                b += (" " + arr[i][j]);
            }
            int dif = strings[n - 1].length() - b.length();
            String spaces = "";
            for(int j = 0; j < dif / 2; j++){
                spaces += " ";
            }
            b = spaces + b + spaces;
            strings[i] = b;
        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
