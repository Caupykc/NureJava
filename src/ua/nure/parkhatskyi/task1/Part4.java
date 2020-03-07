package ua.nure.parkhatskyi.task1;

public class Part4 {
    public static void main(String[] args){
        int sum = 0;
        String str = "";

        for (String s: args) {
            str += s;
        }

        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += (str.charAt(i) - 48);
            }
        }
        System.out.println(sum);
    }
}
