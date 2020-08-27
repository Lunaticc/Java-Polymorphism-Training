package Com.MyTraining.Polymorphism.Challange;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Volvo", 6);

        car.startEngine();
        car.accelerate(40);
        car.carBreak();
        car.carBreak();
        car.accelerate(76);
        car.carBreak();
    }
}
