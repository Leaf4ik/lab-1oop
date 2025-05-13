import java.util.Arrays;

public class AnagramFinder implements TextProcessor {
    protected String[] words;

    public AnagramFinder(String text) {
        this.words = text.replaceAll("[\\p{Punct}]+", "").split("\\s+");
    }

    @Override
    public void findAnagramPairs() {
        boolean found = false;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    System.out.println("Найдена пара анаграмм: \"" 
                        + words[i] + "\" и \"" + words[j] + "\"");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Пар анаграмм не найдено.");
        }
    }

    protected boolean isAnagram(String a, String b) {
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        if (s1.length() != s2.length()) return false;
        char[] c1 = s1.toCharArray(), c2 = s2.toCharArray();
        Arrays.sort(c1); Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}
