public class ToyotaFortuner extends Car {
    private boolean offRoadCapability;

    public ToyotaFortuner(int numberOfDoors, double fuelCapacity, boolean offRoadCapability) {
        super(4, numberOfDoors, fuelCapacity);
        this.offRoadCapability = offRoadCapability;
    }

    public void engageFourWheelDrive() {
        System.out.println("Toyota Fortuner engaged four-wheel drive.");
    }
}
