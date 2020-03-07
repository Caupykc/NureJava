package ua.nure.parkhatskyi.task1;

import java.util.Arrays;

public class Part7 {

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

    public static int sumNumbers(int i){
        if(i == 0) return 0;
        return (i % 10) + sumNumbers(i / 10);
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[index] < array[j]){
                    index = j;
                }
            }
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = getPrimeNumbers(Integer.parseInt(args[0]));
        for (int i = 0; i < arr.length; i++){
            arr[i] = sumNumbers(arr[i]);
        }
        sort(arr);
        int max = arr[0];
        int count = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == max){
                count++;
            }
            else{
                break;
            }
        }
        System.out.println(max + " " + count);
    }
}
