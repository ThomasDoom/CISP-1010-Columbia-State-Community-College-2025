public class PlayListEntry {
    // Fields
    private String title;
    private String artist;
    private int playCount;

    // Constructors
    public PlayListEntry() {
        this.title = "";
        this.artist = "";
        this.playCount = 0;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public int getPlayCount() { return playCount; }

    // Setters
    public void setTitle(String title) { this.title = title; }
    public void setArtist(String artist) { this.artist = artist; }
    public void setPlayCount(int playCount) { this.playCount = playCount; }

    // Methods

}
