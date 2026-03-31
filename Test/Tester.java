import chapter1.Toy;

public class Tester {
    static String toProperString(String word){
        return word.substring(0,1).toUpperCase()+
        word.substring(1).toLowerCase();

    }
    String name = "Gundam";
    public static void main(String[] args) {
        String a,b;
        Tester t1 = new Tester();
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        a=t1.name;
        b=toy1.name;
        System.out.println((a.toLowerCase().startsWith("gun")?" match found":"not matching"));
        System.out.println(toProperString("SCHOOLOFPROG"));
        System.out.println(toProperString("progprince"));
        System.out.println(toy1);
        System.out.println(toy2);
        
        
        
    }
}
