package rocks.zipcode.io.fundamentals;


import rocks.zipcode.io.collections.PowerSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringUtils {
    /**
     * @param string - string to be evaluated
     * @return collection containing all permutations of casing of this string
     */
    public static Collection<String> getAllCasings(String string) {
        int len = string.length();
        Integer integer = (int) Math.pow(2,string.length());
        String[] strings = new String[integer];
        List<String> list = new ArrayList<>();
        PowerSet<String> powerSet = new PowerSet<>(strings);
        // get length of string
        // get range of length
        // get power-set of range

        // for every set in power-set
            // uppercase indices of string using set
        return list;
    }

    /**
     * @param string  - string to be evaluated
     * @param indices - indices to be evaluated
     * @return near-identical string whose characters at specified indices are capitalized
     */
    public static String upperCaseIndices(String string, Integer... indices) {
        Integer[] index = indices;
        Character chars;
        StringBuilder sB = new StringBuilder(string);
        for (int i = 0; i <index.length ; i++) {
            chars =Character.toUpperCase(string.charAt(index[i]));
            sB.setCharAt(index[i],chars);
        }
        return sB.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param valueToBeInserted     - value to insert into string
     * @param index                 - string-index at which to insert value into string
     * @return near-identical string with `valueToBeInserted` inserted at `index`
     */
    public static String insertAtIndex(String stringToBeManipulated, String valueToBeInserted, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.insert(index,valueToBeInserted);

        return stringBuilder.toString();
    }

    /**
     * @param stringToBeManipulated - string to be evaluated
     * @param replacementValue      - value to insert at `index`
     * @param index                 - position of string to be manipulated
     * @return near-identical string with character at `index` replaced with `replacementValue`
     */
    public static String replaceAtIndex(String stringToBeManipulated, Character replacementValue, Integer index) {
        StringBuilder stringBuilder = new StringBuilder(stringToBeManipulated);
        stringBuilder.replace(index,index+1,String.valueOf(replacementValue));

        return stringBuilder.toString();
    }
}