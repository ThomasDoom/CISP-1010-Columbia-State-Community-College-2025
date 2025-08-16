public class TimeTracker {
    // Fields
    private int hours;
    private int minutes;
    private int seconds;

    // Getters
    public int getSeconds() { return seconds; }
    public int getMinutes() { return minutes; }
    public int getHours() { return hours; }
    public int getTotalSeconds() {
        int hoursSeconds = this.hours * 60 * 60;
        int minutesSeconds = this.minutes * 60;
        return hoursSeconds + minutesSeconds + this.seconds;
    }

    // Setters
    public void setHours(int hoursValue) { hours = hoursValue; }
    public void setMinutes(int minutesValue) { minutes = minutesValue; }
    public void setSeconds(int secondsValue) { seconds = secondsValue; }

    // Methods
    public String displayTime() {
        return "Time: " + getHours() + "h " + getMinutes() + "m " + getSeconds() + "s";
    }
}
