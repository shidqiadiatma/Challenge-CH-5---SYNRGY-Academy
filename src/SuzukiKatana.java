public class SuzukiKatana extends Car {
    private boolean sportyModel;

    public SuzukiKatana(int numberOfDoors, double fuelCapacity, boolean sportyModel) {
        super(4, numberOfDoors, fuelCapacity);
        this.sportyModel = sportyModel;
    }

    public void launchControl() {
        System.out.println("Suzuki Katana activated launch control.");
    }
}
