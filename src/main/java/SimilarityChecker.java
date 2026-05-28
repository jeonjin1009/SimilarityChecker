import java.util.HashSet;
import java.util.Set;

public class SimilarityChecker {

    public Float alphaCheck(String String1, String String2) {
        checkException(String1, String2);

        Set<Character> alphaSet = new HashSet<>();
        Set<Character> sameAlphaSet = new HashSet<>();

        addCharToSet(String1, String2, alphaSet);

        addSameCharToSet(String1, String2, sameAlphaSet);

        float alphaSimilarity = Math.round(( (float) sameAlphaSet.size() / alphaSet.size()) * 100) / 100f * 40;

        return (float) Math.round(alphaSimilarity);
    }

    private static void addSameCharToSet(String String1, String String2, Set<Character> sameAlphaSet) {
        for(int String1Index = 0; String1Index< String1.length(); String1Index++) {
            char char1 = String1.charAt(String1Index);
            for(int String2Index = 0; String2Index< String2.length(); String2Index++) {
                char char2 = String2.charAt(String2Index);
                if(char1 == char2) {
                    sameAlphaSet.add(char2);
                }
            }
        }
    }

    private static void addCharToSet(String String1, String String2, Set<Character> alphaSet) {
        for(char char1 : String1.toCharArray()){
            alphaSet.add(char1);
        }
        for(char char2 : String2.toCharArray()){
            alphaSet.add(char2);
        }
    }

    private static void checkException(String input1, String input2) {
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
