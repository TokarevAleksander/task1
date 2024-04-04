import java.util.Scanner;

/**
 * Простой калькулятор для сложения дробных чисел.
 */
public class Calculator {

    /**
     * Метод для выполнения сложения двух дробных чисел.
     * @param num1 Первое дробное число.
     * @param num2 Второе дробное число.
     * @return Результат сложения двух чисел.
     */
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос пользователю для ввода первого числа
        System.out.print("Введите первое число: ");
        double num1 = parseDouble(scanner.nextLine());

        // Запрос пользователю для ввода второго числа
        System.out.print("Введите второе число: ");
        double num2 = parseDouble(scanner.nextLine());

        // Выполнение сложения и вывод результата с округлением до 4 знаков после запятой
        double result = add(num1, num2);
        System.out.printf("Результат: %.4f%n", result);

        scanner.close();
    }

    /**
     * Метод для парсинга строки в дробное число, учитывая возможность использования как точки, так и запятой в качестве разделителя.
     * @param str Строка, которую необходимо преобразовать в число.
     * @return Дробное число.
     */
    private static double parseDouble(String str) {
        str = str.replace(",", "."); // Заменяем запятую на точку
        return Double.parseDouble(str);
    }
}
