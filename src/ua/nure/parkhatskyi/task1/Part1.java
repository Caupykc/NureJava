package ua.nure.parkhatskyi.task1;

public class Part1 {
    public static void main(String[] args){
        int sum = 0;
        for (String s : args) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
    }
}
