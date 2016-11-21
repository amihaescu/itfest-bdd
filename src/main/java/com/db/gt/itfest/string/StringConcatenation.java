package com.db.gt.itfest.string;


import java.util.Arrays;

class StringConcatenation {

    private String concatenatedString;
    private String firstString;
    private String secondString;

    StringConcatenation(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    String alternatedString() {
        char[] firstChars = firstString.toCharArray();
        char[] secondChars = secondString.toCharArray();
        char[] resultChars = new char[firstChars.length + secondChars.length];
        //make the for skip 2 steps
        for (int i = 0; i < firstChars.length + secondChars.length; i++) {
            if (i == 0) {
                resultChars[i] = firstChars[i];
            }
            else if (i % 2 == 0) {
                resultChars[i] = firstChars[i / 2];
            } else {
                resultChars[i] = secondChars[i / 2];
            }
        }
        concatenatedString = Arrays.toString(resultChars);
        return Arrays.toString(resultChars);
    }

    String invertedAlternate() {
        char[] firstChars = firstString.toCharArray();
        char[] secondChars = secondString.toCharArray();
        char[] resultChars = new char[firstChars.length + secondChars.length];
        //make the for skip 2 steps
        for (int i = 0; i < firstChars.length + secondChars.length; i += 2) {
            resultChars[i] = firstChars[i];
            resultChars[i + 1] = secondChars[secondChars.length - i];
        }

        for (int i = 0; i < firstChars.length + secondChars.length; i++) {
            if (i == 0) {
                resultChars[i] = firstChars[i];
            }
            else if (i % 2 == 0) {
                resultChars[i] = firstChars[i / 2];
            } else {
                resultChars[i] = secondChars[secondChars.length - (i/2) - 1];
            }
        }
        concatenatedString = Arrays.toString(resultChars);
        return Arrays.toString(resultChars);
    }


    String concatenateString() {
        concatenatedString = firstString + secondString;
        return firstString + secondString;
    }


    String getConcatenatedString() {
        return concatenatedString;
    }
}
