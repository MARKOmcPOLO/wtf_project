import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

    static Scanner in = new Scanner(System.in);
    static String[] arrStr = new String[10];
    static Integer[] arrInt = new Integer[10];

    public static void main(String[] args) {
        String text;
        System.out.println("Введите элементы строкового массива : ");
        for (int i = 0; i < arrStr.length; i++) {
            text = in.nextLine();
            arrStr[i] = text;
            arrInt[i] = countCharInText(text);
        }
        System.out.println("Строковый массив = " + Arrays.toString(arrStr));
        System.out.println("Числовой массив = " + Arrays.toString(arrInt));
        resultCountCharInText();
    }

    public static int countCharInText(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            count++;
        }
        return count;
    }

    public static void resultCountCharInText(){
        int num = 0;
        for(String word : arrStr){
            System.out.println("Длина слова \"" + word + "\" - " + arrInt[num] + " символов");
            num++;
        }
    }
}
