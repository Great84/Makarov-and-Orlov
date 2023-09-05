public class Task2 {
    public static void main(String[] args) {
        System.out.println(isSumInRange(5, 7));
        printPositiveOrNegative(5);
        System.out.println(isNegative(-3));
        printStringMultipleTimes("Hello", 3);
        System.out.println(isLeapYear(2024));
        int[] binaryArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        flipBinaryArray(binaryArray);
        printArray(binaryArray);
        int[] filledArray = createAndFillArray(100, 5);
        printArray(filledArray);
        int[] arrayToDouble = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doubleNumbersLessThan6(arrayToDouble);
        printArray(arrayToDouble);
        int[][] diagonalMatrix = createDiagonalMatrix(5);
        printMatrix(diagonalMatrix);
    }
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
    public static void printPositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    public static boolean isNegative(int number) {
        return number < 0;
    }
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static void flipBinaryArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
    }
    public static int[] createAndFillArray(int len, int initialValue) {
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = i + 1;
        }
        return result;
    }
    public static void doubleNumbersLessThan6(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
    }
    public static int[][] createDiagonalMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
