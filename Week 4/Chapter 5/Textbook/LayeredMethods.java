public class LayeredMethods {
    public static void main(String[] args) {
        operation1(3);
    }

    /**
    * Adds 5 to param => Displays result => passes param into operation2
    * @param num Number being added
    */

    public static void operation1(int num) {
        num += 5;
        System.out.println("Intermediate result after adding 5: " + num);
        operation2(num);
    }

    /**
    * Multiplies param by 3 => Displays result
    * @param num Number being multiplied
    */

    public static void operation2(int num) {
        num *= 3;
        System.out.println("Final result after multiplying by 3: " + num);
    }
}
