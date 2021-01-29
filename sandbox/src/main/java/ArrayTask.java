import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    static Scanner in = new Scanner(System.in);
    static Integer[] arrIntMax = new Integer[10];
    static String[] arrReverse = new String[10];
    static String[] arrStr = new String[10];
    static Integer[] arrInt = new Integer[10];

    public static void main(String[] args) {
        //task 1
//        initIntegerArray();
//        resultMaxMin();
//        //task 2
//        initReverseArray();
//        viewReversArray(arrReverse);
        //task 3
        initStringArray();
        resultCount();
    }

    //TASK 1
    static void initIntegerArray() {
        String num;
        System.out.println("------------TASK_1------------");
        System.out.println("Введите 10 чисел для вычисления max и min значения: ");
        for (int i = 0; i < arrIntMax.length; i++) {
            num = in.nextLine();
            arrIntMax[i] = Integer.parseInt(num);
        }
    }

    static int max(Integer[] arr) {
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int min(Integer[] arr) {
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    static void resultMaxMin() {
        System.out.println("Max значение массива - " + max(arrIntMax));
        System.out.println("Min значение массива - " + min(arrIntMax));
    }

    //TASK 2
    static void initReverseArray() {
        String text;
        System.out.println("\n------------TASK_2------------");
        System.out.println("Введите 10 элементов строкового массива для вывода их в обратном порядке: ");
        for (int i = 0; i < arrReverse.length; i++) {
            text = in.nextLine();
            arrReverse[i] = text;
        }
        System.out.println("Стандартный массив - " + Arrays.toString(arrReverse));
    }

    static void viewReversArray(String[] arr) {
        String[] arrRev = new String[10];
        int a = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arrRev[a] = arr[i];
            a++;
        }
        System.out.println("Перевернутый массив - " + Arrays.toString(arrRev));
    }

    //TASK 3
    static void initStringArray() {
        String text;
        System.out.println("\n------------TASK_3------------");
        System.out.println("Введите 10 элементов строкового массива для подсчета количества символов: ");
        for (int i = 0; i < arrStr.length; i++) {
            text = in.nextLine();
            arrStr[i] = text;
            arrInt[i] = countCharInText(text);
        }
    }

    static int countCharInText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        return count;
    }

    static void resultCount() {
        int num = 0;
        for (String word : arrStr) {
            System.out.println("Длина слова \"" + word + "\" - " + arrInt[num] + " символов");
            num++;
        }
    }
}
