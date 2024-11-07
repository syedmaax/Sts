import java.util.ArrayList;
import java.util.List;

class MoveHyphens1592 {
    public String reorderSpaces(String text) {
        List<String> wordsList = new ArrayList<>();
        int spaces = 0;
        StringBuilder sb = new StringBuilder();
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if (c == ' ') {
                spaces++;
                if (sb.length() > 0) {
                    wordsList.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) {
            wordsList.add(sb.toString());
        }
        StringBuilder reorder = new StringBuilder();
        int size = wordsList.size();

        if (size == 1) {
            reorder.append(wordsList.get(0));
            for (int i = 0; i < spaces; i++) {
                reorder.append(' ');
            }
            return reorder.toString();
        }
        int spacesEach = spaces / (size - 1);
        int remain = spaces % (size - 1);
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                for (int j = 0; j < spacesEach; j++) {
                    reorder.append(' ');
                }
            }
            reorder.append(wordsList.get(i));
        }
        for (int i = 0; i < remain; i++) {
            reorder.append(' ');
        }

        return reorder.toString();
    }
}