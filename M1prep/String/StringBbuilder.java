
import java.util.LinkedHashSet;
import java.util.Set;

public class StringBbuilder {

    public String processWords(String firstWord, String secondWord) {

        if (firstWord == null || firstWord.trim().isEmpty() || firstWord.contains(" "))
            return firstWord + " is an invalid word";

        if (secondWord == null || secondWord.trim().isEmpty())
            return secondWord + " is an invalid word";

        String reversedSecond = new StringBuilder(secondWord).reverse().toString();

        if (firstWord.equalsIgnoreCase(reversedSecond)) {
            String reversedFirst = new StringBuilder(firstWord).reverse().toString().toUpperCase();
            return reversedFirst.replaceAll("[AEIOU]", "@");
        }

        String combined = (firstWord + secondWord).toUpperCase();

        int vCount = 0, cCount = 0;

        for (int i = 0; i < combined.length(); i++) {
            char c = combined.charAt(i);
            if ("AEIOU".indexOf(c) != -1)////imp
                vCount++;
            else if (Character.isLetter(c)) ////////imp
                cCount++;
        }

        if (vCount == cCount)
            return "Vowels and consonants are equal";

        if (vCount > cCount) {
            Set<Character> vowels = new LinkedHashSet<>();
            for (int i = 0; i < combined.length(); i++) {
                char c = combined.charAt(i);
                if ("AEIOU".indexOf(c) != -1) {
                    vowels.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : vowels)
                sb.append(c);
            return sb.toString().substring(0,2);
        }

        if (cCount > vCount) {
            Set<Character> cons = new LinkedHashSet<>();
            for (int i = 0; i < combined.length(); i++) {
                char c = combined.charAt(i);
                if (Character.isLetter(c) && "AEIOU".indexOf(c) == -1) {
                    cons.add(c);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : cons)
                sb.append(c);
            return sb.toString().substring(0,2);
        }

        return "No sufficient characters";
    }
}

