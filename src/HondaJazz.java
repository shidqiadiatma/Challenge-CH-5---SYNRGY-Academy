public class HondaJazz extends Car {
    private boolean hybridModel;

    public HondaJazz(int numberOfDoors, double fuelCapacity, boolean hybridModel) {
        super(4, numberOfDoors, fuelCapacity);
        this.hybridModel = hybridModel;
    }

    public void playMusic() {
        System.out.println("Honda Jazz is playing music.");
    }
}
