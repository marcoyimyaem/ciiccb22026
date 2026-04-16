public class SubClassSample {


}
abstract class Vihecle{
    Vihecle(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
    }
    int numberOfWheels;
    abstract int getNumWheels();
}

abstract class Car extends Vihecle{
Car(int wheels){
        super(wheels);
        
    }
}
    
class Truck extends Car{
    Truck(){
        super(10);
    }
    int getNumWheels(){
        return numberOfWheels ;
    }
}  


class Bike extends Vihecle{

    Bike(int numberOfWheels) {
        super(2);
        
    }

    @Override
    int getNumWheels() {
        return numberOfWheels;
    }

}
