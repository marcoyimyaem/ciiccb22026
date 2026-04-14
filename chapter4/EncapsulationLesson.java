package chapter4;

public class EncapsulationLesson{
    public static void main(String[] args) {
        Swan mother = new Swan();
        // mother.numberEggs = 31;
        mother.setNumberEggs(31);
        System.out.println(mother.getNumberEggs());
        MobilePhone m1 = new MobilePhone();
        System.out.println(m1.unlock("0000"));
        m1.changePin("0000", "0000");
       
        Student marc = new Student(1, "Marc Yim", "CSS injector", 'a', 12, 56);
         System.out.println("eof");
    }
}

class Swan {
    private int numberEggs;                    // private
    public int getNumberEggs() {                    // getter
      return numberEggs;
    }
    public void setNumberEggs(int numberEggs) {     // setter
        if (numberEggs >= 0)                     // guard condition
            this.numberEggs = numberEggs;
        else
            System.out.println("invalid numberEggs");
    } }

    class MobilePhone{
        private String pin = "0000";
        public boolean unlock(String inutPin){
            return pin.equals(inutPin);
        }

        public void changePin(String oldPin,String newPin ){
            if(newPin.length()<7 & newPin.length()>3){

            } 
            if(!oldPin.equals(newPin)){
                if(pin.equals(oldPin))
                    pin = newPin;
                else
                    System.out.println("Invalid old Pin");
                }
            else{
                System.out.println("New pin must be different");
            }

        }

    }

    class Student{
        private int id;
        private String name;
        private String course;
        private char section;
        private int age;
        private int gwa;


    public Student(int id, String name, String course, char section, int age, int gwa) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.section = section;
        setAge(age);
        setGwa(gwa);
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public char getSection() {
        return this.section;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age>17)
            this.age = age;
        else
            System.out.println("Invalid age");
    }

    public int getGwa() {
        return this.gwa;
    }

    public void setGwa(int gwa) {
        if(gwa>80 && gwa<=100 )
            this.gwa = gwa;
        else{
            System.out.println("invalid grade");
        }

    }
        
    }
