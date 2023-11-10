public class Main {
    public static void main(String[] args) {
        // Membuat objek Honda Jazz
        HondaJazz jazz = new HondaJazz(5, 40.0, true);

        // Membuat objek Toyota Fortuner
        ToyotaFortuner fortuner = new ToyotaFortuner(5, 80.0, true);

        // Membuat objek Suzuki Katana
        SuzukiKatana katana = new SuzukiKatana(2, 30.0, true);

        // Memanggil method pada masing-masing objek
        System.out.println("=== Honda Jazz ===");
        jazz.moveForward();
        jazz.turn();
        jazz.stop();
        jazz.playMusic();

        System.out.println("\n=== Toyota Fortuner ===");
        fortuner.moveForward();
        fortuner.turn();
        fortuner.stop();
        fortuner.engageFourWheelDrive();

        System.out.println("\n=== Suzuki Katana ===");
        katana.moveForward();
        katana.turn();
        katana.stop();
        katana.launchControl();
    }
}
