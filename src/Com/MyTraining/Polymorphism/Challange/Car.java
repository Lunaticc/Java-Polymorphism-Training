package Com.MyTraining.Polymorphism.Challange;
// We are going to go back to the car analogy.
// Create a base class called Car
// It should have a few fields that would be appropriate for a generice car calss.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//



public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;
    private int gear;
    private String name;


    public Car(String name, int cylinders) {
        this.cylinders = cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
        speed = 0;
        gear = 1;
    }
    public void startEngine(){
        cylinderFiring();
        System.out.println("Engine starting");
    }
    private void cylinderFiring(){
        System.out.println("Cylinders firing");
    }

    public boolean accelerate(int speed){
        if(speed < 0){
            System.out.println("Cannot process negative numbers");
            return false;
        }
            if(speed > 46){
                gear = 5;
                this.speed = speed;
            } else if (speed >= 37) {
                gear = 4;
                this.speed = speed;
            } else if (speed >= 27) {
                gear = 3;
                this.speed = speed;
            } else if (speed >= 10) {
                gear = 2;
                this.speed = speed;
            }
            System.out.println("Accelerating to " + speed + "mph, with gear " + gear);
            return true;
    }

    public boolean carBreak(){
        if(this.speed <= 0){
            System.out.println("Car already standing still");
            return false;
        }
        this.speed = 0;
        this.gear = 1;
        System.out.println("Decelerating to a break");
        return true;
    }

}


// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 sub classes for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).












