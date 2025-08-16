public class GolfHole {
    // Fields
    private int holeNumber,     // Current hole
                distanceToHole, // Players distance to hole
                par,            // Players par on hole
                strokeCount;    // Number of swings on currnent hole

    // Constructors
    public GolfHole() {
        setHoleNumber(1);
        setDistanceToHole(300);
        setPar(4);
    }

    public GolfHole(int holeNumber, int distanceToHole, int par) {
        setHoleNumber(holeNumber);
        setDistanceToHole(distanceToHole);
        setPar(par);
    }

    // Getters
    public int getHoleNumber() { return holeNumber; }
    public int getDistanceToHole() { return distanceToHole; }
    public int getPar() { return par; }
    public int getStrokeCount() { return strokeCount; }

    // Setters
    public void setHoleNumber(int holeNumber) { this.holeNumber = holeNumber; }
    public void setDistanceToHole(int distanceToHole) { this.distanceToHole = distanceToHole; }
    public void setPar(int par) { this.par = par; }
    public void setStrokeCount(int strokeCount) { this.strokeCount = strokeCount; }

    // Methods
    public void displayScore(int hole) {
        // Score Card
        System.out.print  ("\033[1;38;5;116m"); // Light blue score card
        System.out.println("┌─────────────────────────────┐");
        System.out.printf ("│            Hole %d           │%n", hole);
        System.out.println("├─────────────────────────────┤");
        System.out.printf ("  Par            %d%n", getPar());
        System.out.printf ("  Strokes        %d%n", getStrokeCount());
        System.out.printf ("  Par vs Score   %s%n", getParStatus());
        System.out.println("└─────────────────────────────┘\n");
    }

    public void displayDistanceToHole() {
        System.out.println("Distance to Hole:  " + getDistanceToHole() + " yards");
    }

    public void updateDistanceToHole(int hitDistance) {
        int newDistance = getDistanceToHole() - hitDistance;

        // Measures for overshooting, convert negative number to positive
        if (newDistance < 0)
            setDistanceToHole(Math.abs(newDistance));
        else
            setDistanceToHole(newDistance);
    }


    public String getParStatus() {
        int differential = getStrokeCount() - getPar();

        if (differential == 0)
            return "At Par";
        else if (differential > 0)
            return "+" + differential + " Above Par";
        else
            return "" + differential + " Below Par";
    }

    public void incrementStrokeCount() {
        setStrokeCount(getStrokeCount() + 1);
    }
}