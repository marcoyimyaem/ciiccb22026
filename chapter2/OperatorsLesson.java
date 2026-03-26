package chapter2;

public class OperatorsLesson {
    public static void main(String[] args) {
     // shift ops
        System.out.println(2<<2);
        System.out.println(15>>1);
        //0 0 1 0
        //8 4 2 1

        //01 1 1 1 
        int p = 3;
        System.out.println(++p+ p++);
        System.out.println(!false);
        // (type) value or variable;
        int g = (byte)26;
        byte w = (byte)g;
        System.out.println();
}
}