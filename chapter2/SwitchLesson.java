package chapter2;

public class SwitchLesson {
    public static void main(String[] args) {
        int dayOfWeek = 6;
        final int friDate = 5;
        switch(dayOfWeek){
            default: System.out.println("Weekends");
            case 1: System.out.println("Hello Monday"); break;
            case 2: System.out.println("Hello Tue"); break;
            
            case 3: System.out.println("Hello Wed");break;
            case 4: System.out.println("Hello Thur");break;
            case friDate: System.out.println("Hello Fridate");break;
            
            

        }
        integer a = 21;
    }
}
