public class Main {

    public static void main(String[] args) {
//        Массив с корректным размером и корректными данными
        String[][] arrya1 = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        doConvertAndSum(arrya1);

//        Массив с некорректным размером и корректными данными
        String[][] arrya2 = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        doConvertAndSum(arrya2);

//        Массив с корректным размером и  некорректными данными
        String[][] arrya3 = new String[][]{{"1", "1", "ТЕСТ", "1"}, {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        doConvertAndSum(arrya3);



    }

    public static void doConvertAndSum(String[][] array) throws MyArraySizeException, MyArrayDataException {

        if (array.length != 4 || (array[0].length != 4) || (array[1].length != 4)
                || (array[2].length != 4) || (array[3].length != 4)) {
            throw new MyArraySizeException("Некорректный размер массива! Ожидается массив 4х4");
        }
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    arraySum += Integer.parseInt(array[i][j]);
                } catch (Exception exception) {
                    throw new MyArrayDataException("Неподходящий формат данных в ячейке [" + i + "][" + j + "].");
                }
            }
        }
        System.out.println("Сумма всех элементов в массиве: " + arraySum);
    }

}
