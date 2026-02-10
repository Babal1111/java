// package M1prep.String;

public class StringMethods {
    public static void main(String[] args) {
        String message ="qwertyuiop";
        
        message.replaceAll("[AEIOUaeiou]", "*");
        
//         replaceAll() is a String method in Java.
// It replaces all matches of a pattern with another string.
// The first argument is a regular expression (regex), not a normal string.
// So this means:
// “Find every character that matches this pattern and replace it with *.”

//if(!token.startsWith("TOKEN-"))



        message.replaceAll("cat", "dog");
        message.replaceFirst("cat", "dog");
        message.replace("cat", "dog");

    }
}
