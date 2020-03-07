package ua.nure.parkhatskyi.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part9 {
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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        ArrayList<Integer> List = new ArrayList<Integer>();
        while((x = nextPrime(x)) <= n) {
            List.add(x);
        }
        String str = List.get(0) + "";
        for (int i = 1; i < List.size(); i++) {
            str += (" " + List.get(i));
        }
        System.out.println(str);
    }
}
