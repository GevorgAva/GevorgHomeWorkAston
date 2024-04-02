import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign(-10, 2);
        printColor(1);
        compareNumbers(-5,4);
        System.out.println(compareNumbersSum(18,3));
        checkPositiveOrNegativeValue(-100);
        System.out.println(isValueNegative(1));
        printText("привет",5);
        checkIsLeapYear(2023);
        arrayMethod();
        arrayMethodSecond();
        arrayMethodThird();
        arrayMethodFourth();
        System.out.println(Arrays.toString(arrayMethodFifth(5,7)));
    }


    public static void printThreeWords(String word1, String word2, String word3) {
        String result = word1 + System.lineSeparator() + word2 + System.lineSeparator() + word3;
        System.out.println(result);

    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;

        if(sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <=0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean compareNumbersSum(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void checkPositiveOrNegativeValue(int value) {
        if (value >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isValueNegative(int value) {

        if (value < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printText(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }

    }

    public static void checkIsLeapYear(int year)
    {
        boolean isLeapYear;

        if (year % 4 == 0) {
            isLeapYear = true;

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        }
        else {
            isLeapYear = false;
        }

        if (!isLeapYear)
            System.out.println(year + "год : Невисокосный");
        else
            System.out.println(year + "год : Високосный");
    }

    public static void arrayMethod() {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayMethodSecond() {
        int [] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void arrayMethodThird() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
            System.out.println(Arrays.toString(arr));
    }

    public static void arrayMethodFourth() {
        int size = 5;
        int [] [] table = new int[size][size];

        for (int i = 0; i < size; i++) {
            table[i][i] = 1;

            table[i][size - i - 1] = 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(table[i]));
        }

    }

    public static int[] arrayMethodFifth(int len, int initialValue) {

        int [] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;

    }

}
