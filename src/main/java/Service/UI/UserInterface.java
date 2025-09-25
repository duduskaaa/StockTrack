package Service.UI;

import java.util.Scanner;

public class UserInterface {
    public static Scanner scanner = new Scanner(System.in);
    public static void startInterface() {
        System.out.println("""
                1. Auth
                2. Information
                3. Exit
                """);

        while (true) {
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1 -> { Auth.authentificate(); }
            }
        }
    }
}
