public class GolfCourse {
    // Fields
    private String name;             // Name of golf course
    private int    numberOfHoles,            // Total number of holes on the course (eg, 18)
                   currentHole,      // Current hole the player is on
                   totalStrokeCount, // Player's stroke count for the numberOfHoles
                   coursePar;        // Par for the numberOfHoles

    // Constructors
    public GolfCourse(String name, int numberOfHoles, int currentHole, int strokeCount, int coursePar) {
        setName(name);
        setNumberOfHoles(numberOfHoles);
        setCurrentHole(currentHole);
        setTotalStrokeCount(strokeCount);
        setCoursePar(coursePar);
    }

    // Getters
    public String getName() { return this.name; }

    public int getNumberOfHoles() { return this.numberOfHoles; }

    public int getCurrentHole() { return this.currentHole; }

    public int getTotalStrokeCount() { return this.totalStrokeCount; }

    public int getCoursePar() { return this.coursePar; }

    // Setters
    public void setName(String name) { this.name = name; }

    public void setNumberOfHoles(int numberOfHoles) { this.numberOfHoles = numberOfHoles; }

    public void setCurrentHole(int currentHole) { this.currentHole = currentHole; }

    public void setTotalStrokeCount(int totalStrokeCount) { this.totalStrokeCount = totalStrokeCount; }

    public void setCoursePar(int coursePar) { this.coursePar = coursePar; }

    // Methods
    public void advanceToNextHole() {
        // Formula: hole = currentHole + 1
        setCurrentHole(getCurrentHole() + 1);
    }

    public void incrementStrokeCount() {
        setTotalStrokeCount(getTotalStrokeCount() + 1);
    }

    public void calculatePar(int par) {
        // Formula: current par + par for current hole
        setCoursePar(getCoursePar() + par);
    }


}