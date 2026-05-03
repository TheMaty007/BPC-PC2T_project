public class Tools {
    public static void clearConsole() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Failed to clear console.");
        }
    }
}
