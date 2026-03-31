import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {
    Scanner opt = new Scanner(System.in);
    boolean cont = true;
    while(cont){

        //program here
        System.out.println("Do you want to continue?");
        String select = opt.nextLine();
        cont = (select.toLowerCase().equals("y") )? true:false;

    }
    System.out.println("end of program");
    //create a program that will generate a random characters based on user input

    //input: 10
    //output: (}h3ikHjfG
}
}
