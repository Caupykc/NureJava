package ua.nure.parkhatskyi.task1;

public class Part2 {
    public static void main(String[] args){
        for(int i = 0; i < args.length / 2; i++){
            String temp = args[args.length - 1 - i];
            args[args.length - 1 - i] = args[i];
            args[i] = temp;
        }
        String str = args[0];
        for (int i = 1; i < args.length; i++) {
            str += (" " + args[i]);
        }
        System.out.println(str);
    }
}
