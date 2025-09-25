package Service.UI;


import Model.User;
import Service.DB.DAO.UserDAO;

public class Auth {
    static void authentificate() {
        System.out.println("""
                1. Log in
                2. Sigh in
                3. Exit
                """);

        boolean run = true;
        while (run) {
            byte choice = UserInterface.scanner.nextByte();
            switch (choice) {
                case 1 -> {
                    System.out.println("In dev");
                }
                case 2 -> {
                    SignIN();
                    Track.userTrack();
                    run = false;
                }
                case 3 -> {
                    run = false;
                }
                default -> {
                    System.out.println("Unknown command");
                }
            }
        }
    }

    private static void LogIN () {
        System.out.println("Your name");
        String user_name = UserInterface.scanner.nextLine();
    }

    private static void SignIN () {
        System.out.println("Your name:");
        String user_name = UserInterface.scanner.nextLine();

        new UserDAO().create(new User(user_name));
    }
}