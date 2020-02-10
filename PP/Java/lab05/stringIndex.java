
/**
 * stringIndex
 */
public class stringIndex {

    public static int indexof(String str, char target) {
        char ar[] = str.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastindexof(String str, char target) {
        char ar[] = str.toCharArray();
        int pos = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == target) {
                pos = i;
            }
        }
        return pos;
    }

    public static void main(final String[] args) {
        String st = "this is a string";
        char tar = 'i';
        System.out.println(indexof(st, tar));
        System.out.println(lastindexof(st, tar));
    }
}