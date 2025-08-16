public class Film {
    // Fields
    private String title;

    // Constructors
    public Film(String titleValue) {
        title = titleValue;
    }

    // Getters
    public String getTitle() { return title; }

    // Methods
    public static boolean searchTitle(Film[] array, String title) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getTitle().equals(title))
                return true;
        }
        return false;
    }
}