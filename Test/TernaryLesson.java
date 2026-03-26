package Test;

import java.util.Scanner;

public class TernaryLesson {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        int num;
        Scanner input = new Scanner(System.in);
        num=input.nextInt();
        // conditional exp() ? T; F;
        System.out.println("\nthe number:"+num+ ((num>0) ? " is a postive " : " is a negative")+" number." );
        String message = 
            (num==0) ?"the number is zero" :(num>0) ? (num>100)?" the number is large positive":" the number is small positive" : " the number is negative"; 
        System.out.println(message);
        int message2 =(num==0) ? 0 :(num>0) ? (num>100)?100:1:-1; 
        System.out.println(message2);
//         if (a > b) {
//     result = (x > y) ? x : y;
// } else {
//     result = (m > n) ? m : n;
// }
    int cc = 1;
    System.out.println( (cc>=0)||(cc++<100) );
    System.out.println(cc);
    System.out.println((cc>=0)?cc:++cc);
    System.out.println(cc);

     }
}
