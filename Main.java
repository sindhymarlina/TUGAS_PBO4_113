import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Lamp.LampSwitch lampSwitch = lamp.new LampSwitch();

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("1. Turn On");
            System.out.println("2. Turn Off");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            // Menambahkan logika untuk membersihkan buffer
            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Membersihkan buffer
            } else {
                scanner.nextLine(); // Membersihkan buffer jika input tidak berupa angka
            }

            switch (choice) {
                case 1:
                    lampSwitch.switchOn();
                    break;
                case 2:
                    lampSwitch.switchOff();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        scanner.close(); // Menutup scanner setelah penggunaan selesai
    }
}