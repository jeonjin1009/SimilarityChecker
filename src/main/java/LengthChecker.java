public class LengthChecker {

    public Float lengthCheck(String str1, String str2) {
        AlphaChecker.checkException(str1, str2);

        int longLen = Math.max(str1.length(), str2.length());
        int shortLen = Math.min(str1.length(), str2.length());
        int gap = longLen - shortLen;
        float tempNumber = Math.round((gap / (float) shortLen) * 100) / 100f;

        float lengthSimilarity = (1 - tempNumber) * 60;

        if (lengthSimilarity < 0) return 0f;

        return (float) Math.round(lengthSimilarity);
    }
}
