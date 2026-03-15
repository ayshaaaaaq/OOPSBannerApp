public class OOPSBannerApp {

    // Inner static class to store character and pattern
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Create pattern objects
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
                "  ***  ",
                " *   * ",
                "*     *",
                "*     *",
                "*     *",
                " *   * ",
                "  ***  "
        };

        String[] pPattern = {
                "*****  ",
                "*    * ",
                "*    * ",
                "*****  ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] sPattern = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        String[] spacePattern = {
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        };

        CharacterPatternMap[] charMaps = {
                new CharacterPatternMap('O', oPattern),
                new CharacterPatternMap('P', pPattern),
                new CharacterPatternMap('S', sPattern),
                new CharacterPatternMap(' ', spacePattern)
        };

        return charMaps;
    }

    // Get pattern for a given character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

    // Print banner
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        for (int line = 0; line < 7; line++) {

            StringBuilder row = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);
                row.append(pattern[line]).append("  ");
            }

            System.out.println(row);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}