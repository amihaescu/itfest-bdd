package com.db.gt.itfest.string;

public class StringManipulation {

    private String string;
    private String concatenatedString;

    StringManipulation(String string) {
        this.string = string;
    }



    String getSubString(int from, int to) {
        return string.substring(from, to);
    }

    Boolean find(String input) {
        return string.contains(input);
    }

    /**
     * Given a string, return a new string where the first and last chars have been exchanged.
     */
    String frontBack() {
        char[] chars = string.toCharArray();
        int last = chars.length - 1;
        char intermediate = chars[0];
        chars[0] = chars[last];
        chars[last] = intermediate;
        return new String(chars);

    }

    /**
     * Given a string, we'll say that the front is the first 3 chars of the string.
     * If the string length is less than 3, the front is whatever is there.
     * Return a new string which is 3 copies of the front.
     */
    String frontThree() {
        String front;
        if (string.length() >= 3) {
            front = string.substring(0, 3);
        } else {
            front = string;
        }
        return front + front + front;
    }

    /*Return true if the given string contains between 1 and 3 'e' chars.*/
    boolean stringContainsE() {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e') count++;
            // alternately: str.substring(i, i+1).equals("e")
        }
        return (count >= 1 && count <= 3);
    }

}
