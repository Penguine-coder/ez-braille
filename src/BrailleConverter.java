public class BrailleConverter {
    private static final String NORMAL = "abcdefghijklmnopqrstuvwxyz ";
    private static final String BRAILLE = "⠁⠃⠉⠙⠑⠋⠛⠓⠊⠚⠅⠇⠍⠝⠕⠏⠟⠗⠎⠞⠥⠧⠺⠭⠽⠵ ";

    // Static initializer to validate the mapping
    static {
        if (NORMAL.length() != BRAILLE.length()) {
            throw new IllegalStateException("Normal and Braille character sets must have the same length");
        }
    }

    /**
     * Converts normal text to Braille
     * @param text The input text to convert
     * @return The Braille representation of the text
     */
    public static String normalToBraille(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        text = text.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            int index = NORMAL.indexOf(currentChar);

            if (index != -1) {
                result.append(BRAILLE.charAt(index));
            } else {
                // If character not found, keep original character
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    /**
     * Converts Braille text back to normal text
     * @param brailleText The Braille text to convert
     * @return The normal text representation
     */
    public static String brailleToNormal(String brailleText) {
        if (brailleText == null || brailleText.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < brailleText.length(); i++) {
            char currentChar = brailleText.charAt(i);
            int index = BRAILLE.indexOf(currentChar);

            if (index != -1) {
                result.append(NORMAL.charAt(index));
            } else {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    /**
     * Utility method to check if conversion is possible for all characters
     * @param text The text to check
     * @return true if all characters can be converted
     */
    public static boolean canConvertToBraille(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (NORMAL.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Gets the supported characters for conversion
     * @return String containing all supported characters
     */
    public static String getSupportedCharacters() {
        return NORMAL;
    }
}