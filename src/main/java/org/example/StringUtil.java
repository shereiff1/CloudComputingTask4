package org.example;

public class StringUtil {

    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    public static boolean isPalindrome(String s) {
        if (s == null) return false;
        String clean = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static int countOccurrences(String text, String word) {
        if (text == null || word == null || word.isEmpty()) return 0;
        int count = 0;
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        int idx = 0;
        while ((idx = lowerText.indexOf(lowerWord, idx)) != -1) {
            count++;
            idx += lowerWord.length();
        }
        return count;
    }

    public static String titleCase(String s) {
        if (s == null || s.isEmpty()) return s;
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(Character.toUpperCase(word.charAt(0)));
            sb.append(word.substring(1).toLowerCase());
        }
        return sb.toString();
    }

    public static boolean isNullOrBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
}