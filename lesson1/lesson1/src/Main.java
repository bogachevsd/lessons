import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //System.out.println("Hello world!");
        System.out.println("Задание 1.");
        int month = 3;
        String task1 = getMonth(month);
        System.out.println("Месяц: " + month);
        System.out.println("Название: " + task1);
        System.out.println("===========");

        System.out.println("Задание 2.");
        int[] arr = {15,25,64,95,13,654,45};
        int num = 64;
        int index = getIndex(arr,num);
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Число: " + num);
        System.out.println("Индекс: " + index);
        System.out.println("===========");

        System.out.println("Задание 3.");
        String str = turnThePagesTurnTheStones();
        System.out.println(str);
        System.out.println("===========");

        System.out.println("Задание 4.");
        int dec = 654;
        String hexNum = convertDecToHex(dec);
        System.out.println("dec = " + dec);
        System.out.println("hex = " + hexNum);
        System.out.println("===========");

        System.out.println("Задание 5.");
        int[] arr2 = bubbleSort(arr);
        System.out.println("Массив: " + Arrays.toString(arr));
        System.out.println("Отсортированный массив: " + Arrays.toString(arr2));
    }

    public static String getMonth(int month) {
        String monthTXT = new String();
        switch (month) {
            case 1: monthTXT = "Январь"; break;
            case 2: monthTXT = "Февраль"; break;
            case 3: monthTXT = "Март"; break;
            case 4: monthTXT = "Апрель"; break;
            case 5: monthTXT = "Май"; break;
            case 6: monthTXT = "Июнь"; break;
            case 7: monthTXT = "Июль"; break;
            case 8: monthTXT = "Август"; break;
            case 9: monthTXT = "Сентябрь"; break;
            case 10: monthTXT = "Октябрь"; break;
            case 11: monthTXT = "Ноябрь"; break;
            case 12: monthTXT = "Декабрь"; break;
        }
        return monthTXT;
    }

    public static int getIndex(int arr[], int num ) {
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (num == arr[i]){
                index = i;
                break;
            }
            else {
                index = -1;
            }
        }
        return index;
    }

    public static String turnThePagesTurnTheStones() {
        String str1 = "HELLO";
        String str2 = new String();
        for (int i = 0; i < str1.length(); i++) {
            str2 = str1.charAt(i) + str2;
        }
        return str2;
    }

    public static String convertDecToHex(int dec){
        String result = new String();
        result = Integer.toHexString(dec);
        return result;
    }

    public static int[] bubbleSort(int[] array1){
        int result[] = new int[0];
        result = array1.clone();
        for(int i = result.length - 1; i > 0; i--){
            for (int j = 0; j < i ; j++){
                if (result[i] < result[j]){
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}