public class SimilarityChecker {

    private final LengthChecker lengthChecker = new LengthChecker();
    private final AlphaChecker alphaChecker = new AlphaChecker();

    public Float check(String str1, String str2) {
        float lengthScore = lengthChecker.lengthCheck(str1, str2);
        float alphaScore = alphaChecker.alphaCheck(str1, str2);
        return lengthScore + alphaScore;
    }
}
