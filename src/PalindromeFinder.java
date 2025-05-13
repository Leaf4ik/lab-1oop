public class PalindromeFinder extends AnagramFinder {

    public PalindromeFinder(String text) {
        super(text);
    }

    /**
     * Операция 2 — поиск палиндромов
     */
    public void findPalindromes() {
        boolean found = false;
        for (String w : words) {
            String clean = w.toLowerCase();
            if (clean.length() > 1 && isPalindrome(clean)) {
                System.out.println("Найден палиндром: \"" + w + "\"");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Палиндромы не найдены.");
        }
    }

    protected boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
