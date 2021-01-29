import org.apache.tools.ant.util.StringUtils;
import org.testng.collections.Sets;

import java.util.*;

public class TaskOne {

    static Scanner in = new Scanner(System.in);
    static String[] array = new String[3];
    static List<String> list = new ArrayList<String>();
    static HashSet<String> set = new HashSet<String>();

    public static void main(String[] args) {
        String text;
        for (int i = 0; i < 3; i++) {
            text = in.nextLine();
            array[i] = text;
            list.add(text);
            set.add(text);
        }
        viewArrayText();
        viewListText();
        viewSetText();
    }

    static void viewArrayText() {
        String text = "";
        for (int i = 0; i < array.length; i++) {
            text = text + array[i] + " ";
        }
        System.out.println(text);
    }

    static void viewListText() {
        String text = "";
        for (String l : list) {
            text = text + l + " ";
        }
        System.out.println(text);
    }

    static void viewSetText() {
        String text = "";
        for (String l : set) {
            text = text + l + " ";
        }
        System.out.println(text);
    }
}
