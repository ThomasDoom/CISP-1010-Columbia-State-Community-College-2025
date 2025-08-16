public class GolfGame {
    public static void main(String[] args) {
        setupGame();

        final int AUTO_HOLE_RANGE = 5;

        GolfRound round = new GolfRound(); // Default: 18 holes | 300 yards | par 72
        GolfClub club = new GolfClub();

        // Roughly customize the hole pars with rounded divison
        int parPerHole = round.getRoundPar() / round.getTotalHoles();

        for (int h = 1; h <= round.getTotalHoles(); h++) {
            GolfHole hole = new GolfHole(h, round.getHoleDistance(), parPerHole);

            // Hit the ball until it's holed
            while (hole.getDistanceToHole() != 0) {
                // Current hole score card
                hole.displayScore(h);

                // UI
                club.displaySelectionMenu();
                if (hole.getStrokeCount() > 0) // Only AFTER the first turn
                    club.displayAction();
                hole.displayDistanceToHole();

                // User input
                club.playerSelectClub();

                // Auto hole if putting within 5 yards (It says 5 feet in the instructions)
                if (hole.getDistanceToHole() <= AUTO_HOLE_RANGE
                    && club.getSelectedClub().equals("Putter")) {
                    // Auto Hole
                    hole.setDistanceToHole(0);
                    hole.incrementStrokeCount();
                } else {
                    // Normal
                    int hitDistance = club.hitBall();
                    hole.updateDistanceToHole(hitDistance);
                    hole.incrementStrokeCount();
                }

                clearScreen();
            }
            // Add current hole's strokes to round total
            round.addStrokeCounts(hole.getStrokeCount());

            // Don't display with final score
            if (h != round.getTotalHoles())
                System.out.println("===== ADVANCED TO NEXT HOLE ====\n");
        }

        finishGame(round);
    }

    private static void clearScreen() {
        System.out.print("\033[2J\033[H");
    }

    private static void setupGame() {
        // Resets ANSI codes when quitting program
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.print("\033[0m");
        }));
        System.out.print("\033[2J\033[H");
    }

    private static void finishGame(GolfRound round) {
        // Final score then end program
        round.roundResults();
        System.out.println("Thanks for playing!\n");
    }
}
