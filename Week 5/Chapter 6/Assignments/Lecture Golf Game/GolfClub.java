import java.util.Random;
import java.util.Scanner;

public class GolfClub {
    // Fields
    private int clubSelected,   // Club selected by user (1-6)
                minClubRange,   // Minimum distance the selected club can hit the ball
                maxClubRange,   // Maximum distance the selected club can hit the ball
                shotDistance;   // Distance in yards of the shot taken

    // Constructors


    // Getters and Setters
    public int getClubSelected() {
        return this.clubSelected;
    }

    public void setClubSelected(int clubSelected) {
        this.clubSelected = clubSelected;
    }

    public int getMinClubRange() {
        return this.minClubRange;
    }

    public void setMinClubRange(int minClubRange) {
        this.minClubRange = minClubRange;
    }

    public int getMaxClubRange() {
        return this.maxClubRange;
    }

    public void setMaxClubRange(int maxClubRange) {
        this.maxClubRange = maxClubRange;
    }

    public int getShotDistance() {
        return this.shotDistance;
    }

    public void setShotDistance(int shotDistance) {
        this.shotDistance = shotDistance;
    }

    // Methods
    public void selectClub() {
        Scanner kb = new Scanner(System.in);

        // Menu to select club
        System.out.println("\n ID      Club        Yards");
        System.out.println("----------------------------");
        System.out.println("[ 1 ]   Putter       1 - 10");
        System.out.println("[ 2 ]   Wedge       10 - 50");
        System.out.println("[ 3 ]   7 iron      20 - 100");
        System.out.println("[ 4 ]   5 iron      30 - 150");
        System.out.println("[ 5 ]   3 wood      40 - 250");
        System.out.println("[ 6 ]   Driver     100 - 300\n");

        // Ask player for choice
        int clubID;
        do {
            System.out.print("Select club ID [1 - 6]: ");
            clubID = kb.nextInt();

            if (clubID < 1 || clubID > 6) {
                System.out.println("\n*** Invalid ID. Must be within the range of [1 - 6] ***\n");
            }
        } while (clubID < 1 || clubID > 6);
        setClubSelected(clubID);

        // Set min and max of selected club's range
        switch (getClubSelected()) {
            case 1: { setMinClubRange(1);   setMaxClubRange(10);  break; }
            case 2: { setMinClubRange(10);  setMaxClubRange(50);  break; }
            case 3: { setMinClubRange(20);  setMaxClubRange(100); break; }
            case 4: { setMinClubRange(30);  setMaxClubRange(150); break; }
            case 5: { setMinClubRange(40);  setMaxClubRange(250); break; }
            case 6: { setMinClubRange(100); setMaxClubRange(300); break; }
        }
    }

    public void hitBall() {
        Random rand = new Random();

        // Generate random shot distance within selected club range
        int clubRange = rand.nextInt(getMaxClubRange() - getMinClubRange() + 1) + getMinClubRange();
        setShotDistance(clubRange);
    }
}