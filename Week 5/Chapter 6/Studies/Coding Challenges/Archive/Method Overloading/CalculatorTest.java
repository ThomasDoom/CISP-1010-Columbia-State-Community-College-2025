public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculate = new Calculator();

        System.out.println(calculate.add(5, 3));
        System.out.println(calculate.add(5.2, 3.4));
        System.out.println(calculate.add(5, 3, 10));
        System.out.println(calculate.add("5", "3"));
    }
}
