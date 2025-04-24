import java.util.Scanner;

public class ChatProgram {
    public static void main(String[] args) {
        boolean exit = false;
        boolean isUser1Turn = true;
        String chatHistoryString = "";
        StringBuffer chatHistoryBuffer = new StringBuffer();

        Scanner scanner = new Scanner(System.in);

        System.out.println("== Simulasi Chat Dua Orang ==");
        System.out.println("Ketik 'exit' untuk keluar.\n");
        while (!exit) {
            String currentUser;
            if (isUser1Turn) {
                currentUser = "User1: ";
            } else {
                currentUser = "User2: ";
            }

            System.out.print(currentUser);
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                exit = true;
            } else {
                String message = currentUser + input + "\n";
                chatHistoryString += message;
                chatHistoryBuffer.append(message);
                isUser1Turn = !isUser1Turn;
            }
        }

        System.out.println("\n=== Riwayat Chat (String) ===");
        System.out.println(chatHistoryString);

        System.out.println("=== Riwayat Chat (StringBuffer) ===");
        System.out.println(chatHistoryBuffer);

        scanner.close();
    }
}
