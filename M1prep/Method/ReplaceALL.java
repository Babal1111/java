// package M1prep.Method;

public class ReplaceALL {
    

    public static String encryptMessage(String message) {
    return message.replaceAll("[AEIOUaeiou]", "*");
}

}
