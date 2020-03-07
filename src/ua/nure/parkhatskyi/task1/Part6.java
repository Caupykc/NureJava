package ua.nure.parkhatskyi.task1;

import java.util.Arrays;

public class Part6 {

    public static int nextPrime(int x){
        for(int i = ++x; true; i++){
            boolean b = true;
            for (int j = 2; j < i; j++){
                if(i % j == 0){
                    b = false;
                    break;
                }
            }
            if(b){
                return i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[0];
        int a = Integer.parseInt(args[0]);
        int p = 1;
        for(int i = 2; a != 1; i++){
            p = nextPrime(p);
            while(a % p == 0){
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = p;
                a /= p;
            }
        }
        String result = args[0] + " =";
        int f = 0;
        for(int i = 0; i < arr.length; i = f){
            int c = 0;
            int u = arr[i];
            for(int j = i; j < arr.length; j++){
                if(u == arr[j]){
                    c++;
                    if(j == arr.length - 1){
                        f = ++j;
                        break;
                    }
                }
                else{
                    f = j;
                    break;
                }
            }
            if(i != 0){
                result += " +";
            }
            result += (" " + u + "^" + c);
        }
        System.out.println(result);
    }
}
