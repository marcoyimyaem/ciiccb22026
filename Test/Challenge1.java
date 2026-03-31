package Test;

import java.util.Random;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("Enter size of string");
        int sizer = input.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int y =0; y<sizer;y++){
            Random r = new Random();
            char a = (char)(r.nextInt(126 - 32+1)+32);
            sb.append(a);
        }
    }
}
