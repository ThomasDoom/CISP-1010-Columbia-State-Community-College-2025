public class GolfRound {
    // Fields
    private int totalHoles,         // Total holes in a golf round
                totalStrokeCount,   // Total strokes in golf round
                roundPar,           // Total par count for round
                holeDistance;        // Total distance each round to hole from start

    // Constructors
    public GolfRound() {
        setTotalHoles(18);
        setHoleDistance(300);
        setRoundPar(72);
        setTotalStrokeCount(0);
    }

    public GolfRound(int totalHoles) {
        setTotalHoles(totalHoles);
        setHoleDistance(300);
        setRoundPar(totalHoles * 4); // Default par 4
        setTotalStrokeCount(0);
    }

    public GolfRound(int totalHoles, int holeDistance, int parPerRound) {
        setTotalHoles(totalHoles);
        setHoleDistance(holeDistance);
        setRoundPar(parPerRound * totalHoles);
        setTotalStrokeCount(0);
    }

    // Getters
    public int getTotalHoles() { return totalHoles; }
    public int getTotalStrokeCount() { return totalStrokeCount; }
    public int getRoundPar() { return roundPar; }
    public int getHoleDistance() { return holeDistance; }

    // Setters
    public void setTotalHoles(int totalHoles) { this.totalHoles = totalHoles; }
    public void setTotalStrokeCount(int totalStrokeCount) { this.totalStrokeCount = totalStrokeCount; }
    public void setRoundPar(int roundPar) { this.roundPar = roundPar; }
    public void setHoleDistance(int holeDistance) { this.holeDistance = holeDistance; }

    // Methods
    public void addStrokeCounts(int strokeCount) {
        setTotalStrokeCount(getTotalStrokeCount() + strokeCount);
    }

    public void roundResults() {
        System.out.print("\033[1;38;5;116m");
        System.out.println("┌─────────────────────────────┐");
        System.out.println("│      Final Score Card       │");
        System.out.println("└─────────────────────────────┘\n");
        System.out.println("┌─────────────────────────────┐");
        System.out.println("  Holes:        " + getTotalHoles() + " Holes");
        System.out.println("  Round Par:    " + getRoundPar() + " Par");
        System.out.println("  Your Score:   " + getTotalStrokeCount());
        System.out.println("  Score vs Par: " + getTotalParStatus());
        System.out.println("└─────────────────────────────┘\n\033[0m");
    }

    public String getTotalParStatus() {
    int differential = getTotalStrokeCount() - getRoundPar();
    if (differential == 0)
        return "At Par";
    else if (differential > 0)
        return "+" + differential + " Above Par";
    else
        return "" + differential + " Below Par";
    }
}
