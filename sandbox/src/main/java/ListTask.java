import java.util.*;

public class ListTask {

    static Scanner in = new Scanner(System.in);
    static List<String> list = new ArrayList<String>();

    public static void main(String[] args) {
        System.out.println("Введите элементы списка :");
        initList();
//        viewCountList();//task 1
//        srchMaxStrs();//task 2
//        srchMinStrs();//task 3
        viewMax();
    }

    //Init list
    private static void initList() {
        for (int i = 0; i < 5; i++) {
            list.add(in.nextLine());
        }
    }

    //TASK 1
    static void viewCountList() {
        System.out.println("\nДлина списка " + list.size() + " элементов :");
        for (String l : list) {
            System.out.println(l);
        }
    }

    //TASK 2
    static void srchMaxStrs() {
        int max = list.get(0).length();
        for (String s : list) {
            if (s.length() > max)
                max = s.length();
        }
        System.out.println("\nЕлементы списка с максимальной длинной :");
        for (String s : list) {
            if (s.length() == max)
                System.out.println(s);
        }
    }

    //TASK 3
    static void srchMinStrs() {
        int min = list.get(0).length();
        for (String s : list) {
            if (s.length() < min)
                min = s.length();
        }
        System.out.println("\nЕлементы списка с минимальной длинной :");
        for (String s : list) {
            if (s.length() == min)
                System.out.println(s);
        }
    }

    static void viewMax() {
        List<String> maxList = new ArrayList<String>();
        int max = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            } else if (list.get(i).length() == max) {
                maxList.add(list.get(i));
            }
        }
        System.out.println(maxList);
    }
}
