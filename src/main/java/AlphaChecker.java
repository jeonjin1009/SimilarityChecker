import java.util.HashSet;
import java.util.Set;

public class AlphaChecker {

    public Float alphaCheck(String str1, String str2) {
        checkException(str1, str2);

        Set<Character> alphaSet = new HashSet<>();
        Set<Character> sameAlphaSet = new HashSet<>();

        addCharToSet(str1, str2, alphaSet);
        addSameCharToSet(str1, str2, sameAlphaSet);

        float alphaSimilarity = Math.round(((float) sameAlphaSet.size() / alphaSet.size()) * 100) / 100f * 40;

        return (float) Math.round(alphaSimilarity);
    }

    private static void addSameCharToSet(String str1, String str2, Set<Character> sameAlphaSet) {
        for (int i = 0; i < str1.length(); i++) {
            char char1 = str1.charAt(i);
            for (int j = 0; j < str2.length(); j++) {
                char char2 = str2.charAt(j);
                if (char1 == char2) {
                    sameAlphaSet.add(char2);
                }
            }
        }
    }

    private static void addCharToSet(String str1, String str2, Set<Character> alphaSet) {
        for (char c : str1.toCharArray()) alphaSet.add(c);
        for (char c : str2.toCharArray()) alphaSet.add(c);
    }

    static void checkException(String input1, String input2) {
        if (input1 == null || input2 == null) {
            throw new IllegalArgumentException();
        }
        for (char word : input1.toCharArray()) {
            if ('0' >= word || word <= '9') {
                throw new IllegalArgumentException();
            }
        }
        for (char word : input2.toCharArray()) {
            if ('0' >= word || word <= '9') {
                throw new IllegalArgumentException();
            }
        }
    }
}
