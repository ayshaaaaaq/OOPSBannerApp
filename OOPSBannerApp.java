
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array declaration and initialization
        String[] lines = {

            String.join(" ", " ***  ", " ***  ", " **** ", " *****"),
            String.join(" ", "*   * ", "*   * ", "*   * ", "*     "),
            String.join(" ", "*   * ", "*   * ", "****  ", "*     "),
            String.join(" ", "*   * ", "*   * ", "*     ", " **** "),
            String.join(" ", "*   * ", "*   * ", "*     ", "     *"),
            String.join(" ", "*   * ", "*   * ", "*   * ", "*   * "),
            String.join(" ", " ***  ", " ***  ", " **** ", " *****")

        };

        // Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}