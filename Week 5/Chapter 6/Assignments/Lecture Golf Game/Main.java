public class Main {
    public static void main(String[] args) {
        GolfCourse course = new GolfCourse("Columbia", 18, 1, 0, 0);
        

        GolfHole hole1 = new GolfHole(1, 300, 4);

        GolfClub club = new GolfClub();

        int distanceBeforeShot = hole1.getDistanceToHole();
        club.selectClub();
        club.hitBall();

        hole1.incrementStrokeCount();
        hole1.calculateUpdatedDistance(club.getShotDistance());
        // System.out.println(club.getClubSelected());

        System.out.printf("Shot Distance: %d%nDistances to Hole:%nBefore: %d%nAfter: %d%n", club.getShotDistance(), distanceBeforeShot, hole1.getDistanceToHole());

    }
}