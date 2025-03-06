import java.util.Arrays;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //public static void main(String[] args) {
    // 1. Метод printThreeWords()
       /*public static void main(String[] args) {
        printThreeWords();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }*/
    // 2. Метод checkSumSign()
       /*public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = -10;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }*/
    // 3. Метод printColor()
    /*public static void main(String[] args) {
        printColor();
    }

    public static void printColor() {
        int value = 50;

        if (value < 0) {
            System.out.println("Красный");
        } else if (value <= 100) { // Если value от 0 (включительно) до 100
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }*/
    // 4. Метод compareNumbers
    /*public static void main(String[] args) {
        compareNumbers();
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 20;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }*/
    // 5. Метод, проверяющий сумму двух чисел
    /*public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println("Сумма " + sum + " находится в диапазоне 10-20");
        } else {
            System.out.println("Сумма " + sum + " вне диапазона 10-20");
        }
    }*/
    // 6. Метод, определяющий знак числа
    /*public static void main(String[] args) {
        checkNumberSign(10);
        checkNumberSign(-5);
        checkNumberSign(0);
    }

    public static void checkNumberSign(int number) {
        if (number > 0) {
            System.out.println(number + " — положительное число.");
        } else if (number < 0) {
            System.out.println(number + " — отрицательное число.");
        } else {
            System.out.println(number + " — это ноль.");
        }
    }*/
    // 7. Вывод положительного или отрицательного числа
    /*public static void main(String[] args) {
        printNumberType();
    }

    public static void printNumberType() {
        int number = -3;

        if (number >= 0) {
            System.out.println(number + " — положительное число");
        } else {
            System.out.println(number + " — отрицательное число");
        }
    }*/
    //8 Метод, печатающий строку n раз
    /*public static void main(String[] args) {
        printStringMultipleTimes("I like Java!", 13); // Вызов метода
    }

    public static void printStringMultipleTimes(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }*/

    //9. Метод, проверяющий високосный ли год
    /*public static void main(String[] args) {
        checkLeapYear();
    }

    public static void checkLeapYear() {
        int year = 2024;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }*/
    //10. Метод, заменяющий 0 на 1 и 1 на 0 в массиве
    /*public static void main(String[] args) {
        invertArray();
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 0) ? 1 : 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }*/
    //11. Метод, заполняющий массив 1-100
    /*public static void main(String[] args) {
        fillArray(); // Вызов метода
    }

    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println("Заполненный массив: " + Arrays.toString(array));
    }*/
    //12. Метод, умножающий числа меньше 6 на 2
    /*public static void main(String[] args) {
        modifyArray();
    }
    public static void modifyArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println("Измененный массив: " + Arrays.toString(array));
    }*/
    // 13. Метод, заполняющий диагонали матрицы 1
   /* public static void main(String[] args) {
        fillDiagonals(5);
    }
    public static void fillDiagonals(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Главная диагональ
            matrix[i][size - i - 1] = 1; // Побочная диагональ
        }
        System.out.println("Матрица с диагоналями:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }*/
    // 14. Метод, создающий массив длины len с initialValue
    /*public static void main(String[] args) {
        int[] resultArray = createArray(5, 7);
        System.out.println("Созданный массив: " + Arrays.toString(resultArray));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array, initialValue);
        return array;
    }*/
}









            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.



