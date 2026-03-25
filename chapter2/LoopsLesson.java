package chapter2;

import java.util.Scanner;

public class LoopsLesson {
    static void method1(){

    }
    static int intSample1(){
        return 0;
    }
    public static void main(String[] args) {
        byte a = 1;
        while((a<=10))
            System.out.println("a = "+a++);
        do
            System.out.println("do while : a = "+a--);
        while (a<10);

        System.out.println("end of program");
        int b = 0;
        boolean bol = true;
        for( ;b<10;b++)
            System.out.println("b = "+b++);

        System.out.println("enter a valid number");
        Scanner q = new Scanner(System.in);
        int limit = q.nextInt();
        for(byte x=1;x<=limit;x++){
            for(int y=1;y<=x;y++){
                System.out.print(x);
            }
            System.out.println();
            
        }
        // for(int qq = intSample1();true;qq=1,System.out.println(qq=21),qq=0){
        //     System.out.println();
        // }
        
       
        
    
    
    }
}