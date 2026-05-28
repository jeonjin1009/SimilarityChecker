public class SimilarityChecker {
    public Float check(String String1, String String2) {
        checkException(String1, String2);

        float LengthSimilarity;

        int longStringLength = Math.max(String1.length(), String2.length());
        int shortStringLength = Math.min(String1.length(), String2.length());
        int Gap = longStringLength - shortStringLength;
        float tempNumber = Math.round((Gap / (float) shortStringLength) * 100) / 100f;

        LengthSimilarity = (1 - tempNumber) * 60;

        if (LengthSimilarity < 0) return 0f;

        return (float) Math.round(LengthSimilarity);
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
