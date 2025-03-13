import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    // 1. God Object - класс берет на себя слишком много обязанностей. Этот класс выполняет генерацию чисел, вычисления, сортировку и вывод.
    private List<Integer> array = new ArrayList<>();

    public void genNumbers() {
        // 2. Magic numbers - использование чисел без пояснения их смысла.
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            array.add(random.nextInt(200));
        }
    }

    public void bikeFindMax() {

        // 3. Reinventing the wheel - пытаемся изобрести что-то своё вместо использования Math.max()
        int max = 0;

        for (int num : array) {
            max = (num > max) ? num : max;
        }

        System.out.println("Максимальное значение: " + max);
    }

    public void sortNumbers() {

        // 4. Cryptic code - неясное название переменной n.
        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }

    }

    public void printNumbers() {
        System.out.println("Массив: " + array);
    }

    // 5. Hard code - жёстко заданные значения.
    public void addNumbersArray() {
        //6. Copy and Paste Programming - дублирование кода вывода.
        array.add(14);
        array.add(37);
        array.add(32);
        array.add(56);
        array.add(5);
        array.add(77);
    }

    // 7. Soap bubble - ненужное усложнение процесса. Сортировка списка чисел избыточным способом.
    public void secondHardSort() {

        boolean sorted = false;
        int a = 0;

        while (!sorted) {
            sorted = true;
            for (int j = 0; j < array.size() - 1 - a; j++) {
                if (array.get(j) > array.get(j + 1)) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                    sorted = false;
                }
            }
            a++;
        }

    }

    // 7. Soft code - избыточная гибкость. Вместо сортировки "пузырьковым" способом, можно обойтись простым встроенным методом Collections.sort()
    public void flexibleSort(boolean descending) {

        int n = array.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if ((descending && array.get(j) < array.get(j + 1)) ||
                        (!descending && array.get(j) > array.get(j + 1))) {
                    int temp = array.get(j);
                    array.set(j, array.get(j + 1));
                    array.set(j + 1, temp);
                }
            }
        }

    }

    public int findMax() {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 9. Creeping featurism - ненужный метод поиска минимума.
    public int findMin() {
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public void legacyCode() {
        // 10. Lava flow - никому ненужный код.
        System.out.println("Йоу!");
    }

    public static void main(String[] args) {

        Main X = new Main();

        X.genNumbers();
        X.printNumbers();
        X.bikeFindMax();
        X.sortNumbers();
        X.printNumbers();
        X.findMax();

    }
}