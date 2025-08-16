public class GolfGame {
    public static void main(String[] args) {
        // Define the golf course
        GolfCourse course = new GolfCourse("Columbia", 18, 0, 0, 0);

        // Loop through all the course's holes
        for (int h = 1; h <= course.getNumberOfHoles(); h++) {
            // Create an instance of a hole object
            GolfHole hole = new GolfHole(h, 300, 4);

            // Update course based on advancing to new hole
            course.advanceToNextHole();
            course.calculatePar(hole.getPar());
            System.out.println("--------------------------------------\n");

            // Loop shots until ball goes into the whole
            while (hole.getDistanceToHole() != 0) {

                // Which hole they are on
                // The distance to the whole
                // Number of hits so far
                // Count over or under par
                System.out.printf("Current Hole: %d%n", course.getCurrentHole());
                System.out.printf("Distance To Hole: %d%n", hole.getDistanceToHole());
                System.out.printf("Number of Strokes: %d%n", hole.getStroke());
                // Formula: par - strokes
                int overUnder = hole.getPar() - hole.getStroke();
                if (overUnder < 0)
                    System.out.printf("Par: Over %d%n", Math.abs(overUnder));
                else if (overUnder == 0)
                    System.out.printf("Par: At Par%n");
                else
                    System.out.printf("Par: Under %d%n", overUnder);


                // Player selectcs club and hits the ball
                GolfClub club = new GolfClub();
                club.selectClub();

                // If player selects putter inside 5 yards, never miss
                if (hole.getDistanceToHole() <= 5 && club.getClubSelected() == 1)
                    club.setShotDistance(hole.getDistanceToHole());
                else
                    club.hitBall();
                System.out.printf("%nShot Distance: %d%n", club.getShotDistance());


                // Update hole based on player's shot
                hole.incrementStrokeCount();
                hole.calculateUpdatedDistance(club.getShotDistance());

                // Update the course based on the player's shot
                course.incrementStrokeCount();

                // Reset terminal view
                System.out.print("\033[2J\033[H");
            }
            System.out.println("\nYOU MADE ITTTTTT\n");


        }

        // Stats for the game/course
    }
}
