package chapter4;

import java.time.*;

public class ConstructorLesson{
    
    public static void main(String[] args) {
        Bunny bunny1 = new Bunny("Bugs");
        Bunny bunny2 = new Bunny("Lola");
        Hamster hamster1 = new Hamster(2);
        Hamster hamster2 = new Hamster(2,"White");
        System.out.println();
        Celebrant c1 = new Celebrant();
        Celebrant c2 = new Celebrant("Jane Doe",16, LocalDate.of(2010, 12, 12));
        System.out.println();
    }
}

class Bunny{
    String name;
    public Bunny(String name){
        this.name = name;
        System.out.println("this is Bunny Constructor");
    }
}

class Hamster{ 
    private String color;
    private int weight;
    public Hamster(int weight){ // 1st constructor
        // this.weight = weight;
        // color = "brown";
        this(weight, "brown");
    }
    public Hamster(int weight,String color){ //2nd constructor
        this.weight = weight;
        this.color = color;
    }
}

class Celebrant{
    String name;
    int age;
    LocalDate birthday;
    Celebrant(String name, int age, LocalDate birthday){
        this.name=name;
        this.age=age;
        this.birthday=birthday;
    
    }
    Celebrant(){
        this("John Doe", 15, LocalDate.of(2000,1,1));
    }
    Celebrant(String name, int age){
        this(name,age,null);
    
    }
    
}