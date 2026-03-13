
public class OOPSBannerApp{

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
    
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                "   ***    ",
                " **    ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                "**     ** ",
                " **   **  ",
                "   ***    "
        });

        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                " ******    ",
                " **    **  ",
                " **      **",
                " **    **  ",
                " ******    ",
                " **        ",
                " **        ",
                " **        ",
                " **        "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                "     *****  ",
                "   **     * ",
                " **       ",
                "   **  ",
                "     *** ",
                "         **  ",
                "          **",
                "         ** ",
                "    *****"
        });

        return new CharacterPatternMap[]{o, o, p, s};
    }

    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        int height = 9;

        for (int row = 0; row < height; row++) {

            for (int i = 0; i < message.length(); i++) {

                String[] pattern =
                        getCharacterPattern(message.charAt(i), charMaps);

                System.out.print(pattern[row] + "   ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}
