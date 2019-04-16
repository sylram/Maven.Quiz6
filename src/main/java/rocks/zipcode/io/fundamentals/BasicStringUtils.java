package rocks.zipcode.io.fundamentals;

public class BasicStringUtils {
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(char[] chars) {
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += chars[i];

        }
        return str;
    }
    /**
     * @param chars - characters used to instantiate a new string object
     * @return new String which wraps the arguments passed in
     */
    public static String getString(Character[] chars) {
        String str = "";
        for (int i = 0; i <chars.length ; i++) {
            str += chars[i];

        }
        return str;

    }

    /**
     * @param string - string to be manipulated
     * @return identical string with lowercase and uppercase vowels removed
     */
    public static String removeAllVowels(String string) {
        char[] vowels = "aeiouAEIOU".toCharArray();
        String str ="";
        for (int i = 0; i <vowels.length ; i++) {
            str = string.replace(String.valueOf(vowels[i]),"");
            string = str;
        }
        return str;
    }

    /**
     * @param string             - string to be manipulated
     * @param charactersToRemove - characters to be removed from string
     * @return
     */
    public static String removeSpecifiedCharacters(String string, String charactersToRemove) {
        char[] chars = charactersToRemove.toCharArray();
        String str="";
        for (int i = 0; i <chars.length ; i++) {
            str = string.replace(String.valueOf(chars[i]),"");
            string = str;
        }

        return str;
    }
}
