import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите вариант:");
        System.out.println("1 — найти палиндромы");
        System.out.println("2 — удалить анаграммы");
        System.out.print("Ваш выбор: ");
        int variant = Integer.parseInt(in.nextLine());

        System.out.print("Введите текст: ");
        String text = in.nextLine();

        switch (variant) {
            case 1:
                PalindromeFinder palindromeFinder = new PalindromeFinder(text);
                System.out.println(); palindromeFinder.findPalindromes();
                break;
            case 2:
                AnagramRemover remover = new AnagramRemover(text);
                System.out.println(); remover.findAnagramPairs();
                break;
            default:
                System.out.println("Неверный выбор.");
        }

        in.close();
    }
}
