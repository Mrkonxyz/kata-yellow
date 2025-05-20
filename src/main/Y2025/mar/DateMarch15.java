package main.Y2025.mar;

public class DateMarch15 {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        int minLength = Math.min(length1, length2);

        StringBuilder result = new StringBuilder(length1 + length2);

        // Merge characters alternatively
        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i)).append(word2.charAt(i));
        }

        // Append the remaining part of the longer string
        if (length1 > minLength) {
            result.append(word1.substring(minLength));
        } else if (length2 > minLength) {
            result.append(word2.substring(minLength));
        }

        return result.toString();
    }

    public char findTheDifference(String s, String t) {
        int xor = 0;
        for (char c : s.toCharArray()) xor ^= c;
        for (char c : t.toCharArray()) xor ^= c;
        return (char) xor;
    }



}
