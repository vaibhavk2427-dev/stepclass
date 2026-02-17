import java.util.*;

class Banner {

    private final Map<Character, List<String>> letters;

    public Banner() {
        letters = new HashMap<>();

        letters.put('O', Arrays.asList(
                " ***** ",
                " *   * ",
                " *   * ",
                " *   * ",
                " ***** "
        ));

        letters.put('P', Arrays.asList(
                " ***** ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     "
        ));

        letters.put('S', Arrays.asList(
                " ***** ",
                " *     ",
                " ***** ",
                "     * ",
                " ***** "
        ));
    }

    
    public void display(String text) {

        text = text.toUpperCase();

        for (int row = 0; row < 5; row++) {

            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);

                if (letters.containsKey(ch)) {
                    System.out.print(letters.get(ch).get(row) + "  ");
                }
            }

            System.out.println();
        }
    }
}

public class UCO1 {

    public static void main(String[] args) {

        Banner banner = new Banner();
        banner.display("OOPS");

    }
}