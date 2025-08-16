public class GolfHole {
    // FIELDS
    private int hole,             // Current hole number
                distanceToHole,   // Distance to the hole
                par,              // Par for this hole
                stroke;           // How many times the ball has been hit on this hole

    // CONSTRUCTORS
    public GolfHole(int hole, int distanceToHole, int par) {
        setHole(hole);
        setDistanceToHole(distanceToHole);
        setPar(par);
        setStroke(0);
    }

    // GETTERS
    public int getHole()           { return hole; }

    public int getDistanceToHole() { return distanceToHole; }

    public int getPar()            { return par; }

    public int getStroke()         { return stroke; }

    // SETTERS
    public void setHole(int hole)                     { this.hole = hole; }

    public void setDistanceToHole(int distanceToHole) { this.distanceToHole = distanceToHole; }

    public void setPar(int par)                       { this.par = par; }

    public void setStroke(int stroke)                 { this.stroke = stroke; }

    // METHODS
    // Calculate new distance to hole after hit
    public void calculateUpdatedDistance(int shotDistance) {
        // Formula: updatedDistance = distanceToHole - shitDistance
        // Set the absolute value'd result as the updated distance
        setDistanceToHole(Math.abs(getDistanceToHole() - shotDistance));
    }

    // Update stroke count after hit
    public void incrementStrokeCount() {
        // Formula: stroke++ for every shot
        setStroke(getStroke() + 1);
    }
}
