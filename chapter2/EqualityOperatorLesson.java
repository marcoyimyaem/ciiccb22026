package chapter2;

public class EqualityOperatorLesson {
   public static void main(String[] args) {
      Person p1 = new Person("marc");
      Person p2 = new Person("Donald");
      Person p3 = p1;
      System.out.println(p1==p2);
      System.out.println(p1==p3);
      
   }
}

class  Person{
String name;
   Person(String name){
   this.name=name;}
}
