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
        return switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "";
        };
    }

    public static int getIndex(int[] arr, int num ) {
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
        String str2 = "";
        for (int i = 0; i < str1.length(); i++) {
            str2 = str1.charAt(i) + str2;
        }
        return str2;
    }

    public static String convertDecToHex(int dec){
        return Integer.toHexString(dec);
    }

    public static int[] bubbleSort(int[] array1){
        int[] result;
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