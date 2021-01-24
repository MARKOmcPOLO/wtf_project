import java.util.ArrayList;
import java.util.Scanner;

public class ListTask {

    static Scanner in = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<String>();

    public static void main(String[] args) {

        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());
        list.add(in.nextLine());

        for (String l : list) {
            System.out.println(l);
        }
    }
}
