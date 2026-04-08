package chapter4;

import chapter1.Toy;

public class ReturnType {
    void startEngine(){
        return;
    }
    int getAge(){ 
        return (byte) 23;
        
    }
    Avocado getAvocado(){
        return null;
    }
    boolean oddOrEven(int a){
        // boolean result = ((a%2)==0) ? true : false;
        // return result;
        return ((a%2)==0) ? true : false;
    }
    int addTwoNumbers(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        ReturnType rt = new ReturnType();
        System.out.println("Good Morning you are now "+ rt.getAge()+" years old");
        int y = 123230,z = 1;
        System.out.println("is the value "+y+" even number?: "+rt.oddOrEven(y));
        System.out.println("a = "+y+"\nb = "+z+"\na + b = "+rt.addTwoNumbers(y, z));
        Avocado avodado = new Avocado();
        rt.getAvocado();
        
    }
}

class Avocado{
    //  returnType method1(method2){ return returnType}

    // Avocado method1(Toy toy){
    //     return new Avocado();
    // }
    // Toy method2(){
    //     return new Toy();
    // }
    // public static void main(String[] args) {
    //     Avocado av1 = new Avocado();
    //     Object fakeToy = new Object();
    //     av1.method1(av1.method2());
    //     av1.method1((Toy)(fakeToy));
    // }
}