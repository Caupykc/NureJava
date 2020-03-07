package ua.nure.parkhatskyi.task1;

import java.util.Arrays;

public class Part5 {

    public static boolean isPrime(int i){
        if(i <= 1) return false;
        for(int j = 2; j < i; j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] getPrimeNumbers(int n){
        int[] arr = new int[n];
        int a = 2;
        for (int i = 0; i < n; i++){
            for (int j = a; true; j++){
                if(isPrime(j)){
                    arr[i] = j;
                    a = ++ j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = getPrimeNumbers(Integer.parseInt(args[0]));
        String str = arr[0] + "";
        for (int i = 1; i < arr.length; i++) {
            str += (" " + arr[i]);
        }
        System.out.println(str);
    }
}
