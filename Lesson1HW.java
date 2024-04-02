public class Lesson1HW {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");
        checkSumSign(-10, 2);
        printColor(1);
        compareNumbers(-5,4);
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
}
