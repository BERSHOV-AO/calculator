public class Main {
    /**
     * Деление на 0 запрещено.
     * Создаем конструкцию (try catch), ловим исключение типа ArithmeticException, если пытаемся разделить на 0.
     *
     * @param args
     */

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);

        try {
            int c = calculator.devide.apply(a, b);
            calculator.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + ", делить на 0 нельзя");
        }
        System.out.println("end!");
    }
}
