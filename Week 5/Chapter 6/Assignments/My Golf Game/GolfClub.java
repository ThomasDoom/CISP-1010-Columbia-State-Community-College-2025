import java.util.Random;
import java.util.Scanner;

public class GolfClub {
    // Fields
    private String selectedClub;  // Current club selected by player
    private int minRange,         // Minimum hit distance of selected club
                maxRange,         // Maximum hit distance of selected club
                hitDistance;      // Distance the ball is hit on turn

    // Constructors
    public GolfClub() {
        setSelectedClub("None");
        setMinRange(0);
        setMaxRange(0);
    }

    // Getters
    public String getSelectedClub() { return selectedClub; }
    public int getMinRange() { return minRange; }
    public int getMaxRange() { return maxRange; }
    public int getHitDistance() { return hitDistance; }

    // Setters
    public void setSelectedClub(String SelectedClub) { this.selectedClub = SelectedClub; }
    public void setMaxRange(int maxRange) { this.maxRange = maxRange; }
    public void setMinRange(int minRange) { this.minRange = minRange; }
    public void setHitDistance(int hitDistance) { this.hitDistance = hitDistance; }

    // Methods
    public void displaySelectionMenu() {
        System.out.println("\033[1;37m ID  │  Club   │ Range (yards) ");
        System.out.println("═════╧═════════╪═══════════════");
        System.out.println("[ 1 ]  Putter  │    1 - 10");
        System.out.println("[ 2 ]  Wedge   │   10 - 50");
        System.out.println("[ 3 ]  7 iron  │   20 - 100");
        System.out.println("[ 4 ]  5 iron  │   30 - 150");
        System.out.println("[ 5 ]  3 wood  │   40 - 250");
        System.out.println("[ 6 ]  Driver  │  100 - 300");
        System.out.println("═══════════════╧═══════════════\n");
    }

    public void displayAction() {
        System.out.printf ("Club:              %s%n", getSelectedClub());
        System.out.printf ("Club Range:        %d - %d%s%n%n", getMinRange(), getMaxRange(), " yards");
        System.out.println("Distance hit:      " + getHitDistance() + " yards");
    }

    public void playerSelectClub() {
        Scanner kb = new Scanner(System.in);

        // User input [1 - 6]
        int clubId;
        do {
            System.out.print("\n\033[1;32mSelect a club ID [1 - 6]: ");
            clubId = kb.nextInt();
            if (clubId < 1 || clubId > 6)
                System.out.println("\n INVALID CLUB SELECTION. Try again ...\n");
        } while (clubId < 1 || clubId > 6);

        // Send valid ID through for attribute setting
        setClubAttributes(clubId);
        System.out.println("\033[0m");
    }

    private void setClubAttributes(int clubId) {
        switch (clubId) {
        case 1 -> {
            setSelectedClub("Putter");
            setMinRange(1);
            setMaxRange(10);
            }
        case 2 -> {
            setSelectedClub("Wedge");
            setMinRange(10);
            setMaxRange(50);
            }
        case 3 -> {
            setSelectedClub("7 iron");
            setMinRange(20);
            setMaxRange(100);
            }
        case 4 -> {
            setSelectedClub("5 iron");
            setMinRange(30);
            setMaxRange(150);
            }
        case 5 -> {
            setSelectedClub("3 wood");
            setMinRange(40);
            setMaxRange(250);
            }
        case 6 -> {
            setSelectedClub("Driver");
            setMinRange(100);
            setMaxRange(300);
            }
        default -> System.out.println("\nERROR: No Club Selected.\n");
        }
    }

    public int hitBall() {
        Random random = new Random();
        setHitDistance(random.nextInt(getMaxRange() - getMinRange() + 1) + getMinRange());
        return getHitDistance();
    }
}
