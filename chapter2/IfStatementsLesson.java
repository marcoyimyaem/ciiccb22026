package chapter2;

public class IfStatementsLesson {
    static boolean eve(){
        return false;
    } 
    public static void main(String[] args) {
        int hourOfDay = 20;
        boolean isMorning = true;
        if(hourOfDay<11 )
            System.out.println("Good Morning1");
            System.out.println("Good Morning1!!!!");

        if(hourOfDay<11 )
            System.out.println("Good Morning2");
        else
            System.out.println("Good Afternoon2");

         if(hourOfDay>17 )
            {
                System.out.println("Good Eve3");
                System.out.println("Kumain kana ba?");
                if(hourOfDay>=22){
                    System.out.println("Good night");
                }
            }
        else if(hourOfDay>11)
            System.out.println("Good Afternoon3");
            
        else
            System.out.println("Good Morning3");
        
      
            
    }
}
