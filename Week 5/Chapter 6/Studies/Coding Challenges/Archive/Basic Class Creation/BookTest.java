
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("Shadow Slave", "GuiltyThree", 2458);
        // Set values and test methods
        book1.displayInfo();

        Book book2 = new Book("Tao Te Ching", "Christopher");
        book2.displayInfo();
    }
}