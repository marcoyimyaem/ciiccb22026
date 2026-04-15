package chapter4;
import java.util.*;
import java.util.function.*;
public class LambdaLesson {

    static void print(List<Animal> animals,Predicate<Animal> checker){
        for(Animal animal: animals){
            if( checker.test(animal)){
                System.out.print(animal+", ");
            }
        }
        System.out.println("*************");
    }
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Fish", false, true,1));
        animals.add(new Animal("Kangaroo", true, false,5));
        animals.add(new Animal("Rabbit", true, false,2));
        animals.add(new Animal("Trutle", false, true,10));
        animals.add(new Animal("Frog", true, true,2));
        animals.add(new Animal("Kaola", false, false,6));
        // print(animals, new CheckIfHopper());
        // print(animals, new CheckIfSwimmer());
        print(animals, a->a.canSwim());
        print(animals, a->a.canHop());
        print(animals, a->(a.canHop() && a.canSwim()));
        print(animals, a->(!a.canHop() && !a.canSwim()));
        print(animals, a->a.getAge()>3);
        NumberiInterface ni = (a,b,z)->{ return a+b;};
        NumberiInterface ni2 = (a,b,z)-> a*b+100;
        System.out.println(ni.aPlusB(4, 5,false));
        System.out.println(ni2.aPlusB(8, 9,false));
        DiscountItems tenPercent = (a)-> a - (a*0.10);
        DiscountItems twentyPercent = (a)-> a - (a*0.20);
        DiscountItems fiftyPercent = (a)-> a - (a*0.50);
        int ItemTotal = 1000;
        System.out.println(tenPercent.dc(ItemTotal));
        System.out.println(twentyPercent.dc(ItemTotal));
        System.out.println(fiftyPercent.dc(ItemTotal));

        }
    
}

class Animal{
    private String species;
    private boolean canHop;
    private boolean canSwim;
    private int age;
    public Animal(String speciesName,boolean hopper,boolean swimmer,int age){
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
        this.age = age;
    }
    public boolean canHop(){ return canHop;}
    public boolean canSwim(){ return canSwim;}
    public int getAge(){ return age;}
    public String toString(){ 
        return species+"(age is "+getAge()+")";} //Animal@678945BFHJ
}


// interface CheckTrait{
//     boolean test(Animal a);
// }
// class CheckIfHopper implements CheckTrait{
//     public boolean test(Animal a){
//         return a.canHop();
//     }
// }
// class CheckIfSwimmer implements CheckTrait{
//     public boolean test(Animal a){
//         return a.canSwim();
//     }
// }
interface NumberiInterface{
    int aPlusB(int a, int b, boolean t);
}
interface DiscountItems{
    double dc(double q);
}