package ua.nure.parkhatskyi.task1;

public class Part3 {
    public static int NOD(int i1, int i2){
        if(i2 != 0) return NOD(i2, i1 % i2);
        return i1;
    }

    public static int NOK(int i1, int i2){
        int i = NOD(i1, i2);
        return i * (i1 / i) * (i2 / i);
    }

    public static void main(String[] args){
        int i1 = Integer.parseInt(args[0]);
        int i2 = Integer.parseInt(args[1]);
        System.out.println(NOD(i1, i2) + " " + NOK(i1, i2));
    }
}
