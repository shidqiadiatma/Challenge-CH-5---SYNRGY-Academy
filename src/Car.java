public class Car extends Vehicle {
    private int numberOfDoors;
    private double fuelCapacity;

    public Car(int wheels, int numberOfDoors, double fuelCapacity) {
        super(wheels);
        this.numberOfDoors = numberOfDoors;
        this.fuelCapacity = fuelCapacity;
    }

    public void shiftGear() {
        System.out.println("Car is shifting gear.");
    }

    @Override
    public void moveForward() {
        System.out.println("Car is moving forward.");
    }

    @Override
    public void turn() {
        System.out.println("Car is turning.");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
}
