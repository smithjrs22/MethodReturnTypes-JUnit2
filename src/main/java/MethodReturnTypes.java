
import java.util.Scanner;
public class MethodReturnTypes {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(stringy("String of text"));
        System.out.println(inty(5));
        System.out.println(booly(false));
    }

    public static String stringy(String s){
        return s;
    }
    public static Integer inty(int i){
        return i;
    }
    public static Boolean booly(boolean b){
        return b;
    }
}
