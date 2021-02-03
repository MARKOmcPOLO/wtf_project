import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxList {
    static Scanner in = new Scanner(System.in);
    static List<String> list = new ArrayList<String>();
    static List<String> maxList = new ArrayList<String>();
    static List<Integer> length = new ArrayList<Integer>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            list.add(in.nextLine());
        }
        System.out.println(viewMaxText());
    }

    static Integer count() {
        for (int i = 0; i < list.size(); i++) {
            length.add(list.get(i).length());
        }
        return length.stream().max(Integer::compareTo).get();
    }

    static List<String> viewMaxText() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == count()) {
                maxList.add(list.get(i));
            }
        }
        return maxList;
    }
}
