/*Create a superClass Vehicle that has a method noOfWheels() of return type void and accepts no parameters. Create two subclasses Scooter and Car which has method noOfWheels()  

noOfWheels() of Vehicle should display “No of wheels undefined”.

noOfWheels() of Scooter should display “No of wheels 2”.

noOfWheels() of Car should display “No of wheels 4”.*/

public class Main {

    public static void main(String[] args) {

        //write your answer here
        Vehicle v= new Vehicle();
        v.noOfWheels();

        Scooter s = new Scooter();
        s.noOfWheels();

        Car c = new Car();
        c.noOfWheels();
    }
}
// super class
class Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels undefined");
    }
}
//subclass 1
class Scooter extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 2");
    }
}
//subclass 2
class Car extends Vehicle{
    void noOfWheels(){
        System.out.println("No of wheels 4");
    }
    
}
