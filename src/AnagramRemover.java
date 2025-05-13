import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnagramRemover extends PalindromeFinder {

    public AnagramRemover(String text) {
        super(text);
    }

    /**
     * Переопределённая findAnagramPairs — удаление слов-анаграмм
     */
    @Override
    public void findAnagramPairs() {
        Set<Integer> toRemove = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isAnagram(words[i], words[j])) {
                    toRemove.add(i);
                    toRemove.add(j);
                }
            }
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!toRemove.contains(i)) {
                result.add(words[i]);
            }
        }

        if (result.isEmpty()) {
            System.out.println("Все слова-анаграммы удалены, ничего не осталось.");
        } else {
            System.out.println("Текст без анаграмм:");
            System.out.println(String.join(" ", result));
        }
    }
}
