public class P1  {
    
    public String CleanseAndInvert(String input) {

        // Input validation
        if (input == null || input.length() < 6) {
            return "Invalid Input.";
        }

        // Must contain only alphabets (no spaces, digits, special characters)
        if (!input.matches("[a-zA-Z]+")) {
            return "Invalid Input.";
        }

        // Convert to lowercase
        input = input.toLowerCase();

        StringBuilder sb = new StringBuilder(input);

        // Remove characters with even ASCII values
        for (int i = sb.length() - 1; i >= 0; i--) {
            if ((int) sb.charAt(i) % 2 == 0) {
                sb.deleteCharAt(i);
            }
        }

        // Reverse remaining characters
        sb.reverse();

        // Convert characters at even index to uppercase
        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        // Optional testing
        P1 sol = new P1();
        System.out.println(sol.CleanseAndInvert("Computer"));
    }
}
