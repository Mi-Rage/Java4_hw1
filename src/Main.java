public class Main {
    public static void main(String[] args) {
        System.out.println(expo(3, 5));
        System.out.println(minElemArray(new int[] {6, 8, 20, 32, 72, 3, 5, 2, 9, 11, 16}));
        System.out.println(averageArray(new int[] {6, 8, 20, 32, 72, 3, 5, 2, 9, 11, 16}));
    }

    /**
     * Простейший метод возведения в степень
     * @param base - возводимое число
     * @param rate - степень
     * @return result - результат
     * Сложность алгоритма линейная O(n), и зависит от переменной rate.
     * Какое значение rate будет передано - столько циклов и выполнит метод.
     */
    public static long expo(int base, int rate) {
        long result = 1;
        for (int i = 0; i < rate; i++) {
            result = result * base;
        }
        return result;
    }

    /**
     * Метод поиска минимального элемента в массиве
     * @param array - массив для поиска мин элемента
     * @return min - минимальный элемент
     * Сложность алгоритма линейная O(n), и зависит от переданного массива.
     * Сколько элементов имеет переданный массив - столько циклов и выполнит метод.
     */
    public static int minElemArray(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Метод определения среднего арифметического массива
     * @param array - исходный массив
     * @return result - среднее арифметическое
     * Сложность алгоритма линейная O(n), и зависит от переданного массива.
     * Сколько элементов имеет переданный массив - столько циклов и выполнит метод.
     * Последующая операция деления суммы на к-во элементов не учитывается.
     */
    public static float averageArray(int[] array) {
        float result = 0;
        for (int value : array) {
            result += value;
        }
        if (array.length > 0) {
            result = result / array.length;
        }
        return result;
    }


}
