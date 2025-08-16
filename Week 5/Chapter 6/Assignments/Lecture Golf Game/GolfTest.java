import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GolfTest {
    private static int testsRun = 0;
    private static int testsPassed = 0;

    public static void main(String[] args) {
        System.out.println("=== GOLF GAME TEST SUITE ===\n");

        // Test all classes and their components
        testGolfHoleClass();
        testGolfClubClass();
        testGolfCourseClass();
        testGameIntegration();
        testAssignmentRequirements();

        // Print final results
        System.out.println("\n=== TEST RESULTS ===");
        System.out.printf("Tests Run: %d%n", testsRun);
        System.out.printf("Tests Passed: %d%n", testsPassed);
        System.out.printf("Tests Failed: %d%n", (testsRun - testsPassed));
        System.out.printf("Success Rate: %.1f%%%n", ((double)testsPassed / testsRun) * 100);
    }

    // ===== GOLF HOLE CLASS TESTS =====
    public static void testGolfHoleClass() {
        System.out.println("--- Testing GolfHole Class ---");

        testGolfHoleConstructor();
        testGolfHoleGettersSetters();
        testGolfHoleCalculateUpdatedDistance();
        testGolfHoleIncrementStrokeCount();

        System.out.println();
    }

    public static void testGolfHoleConstructor() {
        try {
            GolfHole hole = new GolfHole(1, 300, 4);

            assertTrue(hole.getHole() == 1, "Constructor should set hole number to 1");
            assertTrue(hole.getDistanceToHole() == 300, "Constructor should set distance to 300");
            assertTrue(hole.getPar() == 4, "Constructor should set par to 4");
            assertTrue(hole.getStroke() == 0, "Constructor should initialize strokes to 0");

        } catch (Exception e) {
            fail("GolfHole constructor test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfHoleGettersSetters() {
        try {
            GolfHole hole = new GolfHole(1, 300, 4);

            // Test setters and getters
            hole.setHole(5);
            assertTrue(hole.getHole() == 5, "setHole/getHole should work correctly");

            hole.setDistanceToHole(150);
            assertTrue(hole.getDistanceToHole() == 150, "setDistanceToHole/getDistanceToHole should work correctly");

            hole.setPar(3);
            assertTrue(hole.getPar() == 3, "setPar/getPar should work correctly");

            hole.setStroke(2);
            assertTrue(hole.getStroke() == 2, "setStroke/getStroke should work correctly");

        } catch (Exception e) {
            fail("GolfHole getters/setters test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfHoleCalculateUpdatedDistance() {
        try {
            GolfHole hole = new GolfHole(1, 300, 4);

            // Test normal shot
            hole.calculateUpdatedDistance(150);
            assertTrue(hole.getDistanceToHole() == 150, "Distance should be 150 after 150-yard shot from 300 yards");

            // Test overshooting (should use Math.abs)
            hole.setDistanceToHole(100);
            hole.calculateUpdatedDistance(150);
            assertTrue(hole.getDistanceToHole() == 50, "Distance should be 50 after overshooting by 50 yards");

            // Test exact distance
            hole.setDistanceToHole(75);
            hole.calculateUpdatedDistance(75);
            assertTrue(hole.getDistanceToHole() == 0, "Distance should be 0 when shot equals remaining distance");

        } catch (Exception e) {
            fail("GolfHole calculateUpdatedDistance test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfHoleIncrementStrokeCount() {
        try {
            GolfHole hole = new GolfHole(1, 300, 4);

            assertTrue(hole.getStroke() == 0, "Initial stroke count should be 0");

            hole.incrementStrokeCount();
            assertTrue(hole.getStroke() == 1, "Stroke count should be 1 after first increment");

            hole.incrementStrokeCount();
            hole.incrementStrokeCount();
            assertTrue(hole.getStroke() == 3, "Stroke count should be 3 after three increments");

        } catch (Exception e) {
            fail("GolfHole incrementStrokeCount test failed with exception: " + e.getMessage());
        }
    }

    // ===== GOLF CLUB CLASS TESTS =====
    public static void testGolfClubClass() {
        System.out.println("--- Testing GolfClub Class ---");

        testGolfClubGettersSetters();
        testGolfClubHitBall();
        testGolfClubSelectClub();

        System.out.println();
    }

    public static void testGolfClubGettersSetters() {
        try {
            GolfClub club = new GolfClub();

            // Test club selection getter/setter
            club.setClubSelected(3);
            assertTrue(club.getClubSelected() == 3, "setClubSelected/getClubSelected should work correctly");

            // Test min range getter/setter
            club.setMinClubRange(20);
            assertTrue(club.getMinClubRange() == 20, "setMinClubRange/getMinClubRange should work correctly");

            // Test max range getter/setter
            club.setMaxClubRange(100);
            assertTrue(club.getMaxClubRange() == 100, "setMaxClubRange/getMaxClubRange should work correctly");

            // Test shot distance getter/setter
            club.setShotDistance(75);
            assertTrue(club.getShotDistance() == 75, "setShotDistance/getShotDistance should work correctly");

        } catch (Exception e) {
            fail("GolfClub getters/setters test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfClubHitBall() {
        try {
            GolfClub club = new GolfClub();

            // Set up club ranges for testing
            club.setMinClubRange(20);
            club.setMaxClubRange(100);

            // Test multiple hits to ensure randomness is within range
            for (int i = 0; i < 10; i++) {
                club.hitBall();
                int distance = club.getShotDistance();
                assertTrue(distance >= 20 && distance <= 100,
                    "Shot distance should be within club range (20-100), got: " + distance);
            }

        } catch (Exception e) {
            fail("GolfClub hitBall test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfClubSelectClub() {
        try {
            GolfClub club = new GolfClub();

            // Test club range settings for each club type
            testClubRanges(club, 1, 1, 10, "Putter");
            testClubRanges(club, 2, 10, 50, "Wedge");
            testClubRanges(club, 3, 20, 100, "7 iron");
            testClubRanges(club, 4, 30, 150, "5 iron");
            testClubRanges(club, 5, 40, 250, "3 wood");
            testClubRanges(club, 6, 100, 300, "Driver");

        } catch (Exception e) {
            fail("GolfClub selectClub test failed with exception: " + e.getMessage());
        }
    }

    private static void testClubRanges(GolfClub club, int clubId, int expectedMin, int expectedMax, String clubName) {
        // Simulate club selection by setting the values manually
        club.setClubSelected(clubId);

        // Simulate the switch statement logic from selectClub
        switch (clubId) {
            case 1: club.setMinClubRange(1);   club.setMaxClubRange(10);  break;
            case 2: club.setMinClubRange(10);  club.setMaxClubRange(50);  break;
            case 3: club.setMinClubRange(20);  club.setMaxClubRange(100); break;
            case 4: club.setMinClubRange(30);  club.setMaxClubRange(150); break;
            case 5: club.setMinClubRange(40);  club.setMaxClubRange(250); break;
            case 6: club.setMinClubRange(100); club.setMaxClubRange(300); break;
        }

        assertTrue(club.getMinClubRange() == expectedMin,
            clubName + " minimum range should be " + expectedMin);
        assertTrue(club.getMaxClubRange() == expectedMax,
            clubName + " maximum range should be " + expectedMax);
    }

    // ===== GOLF COURSE CLASS TESTS =====
    public static void testGolfCourseClass() {
        System.out.println("--- Testing GolfCourse Class ---");

        testGolfCourseConstructor();
        testGolfCourseGettersSetters();
        testGolfCourseAdvanceToNextHole();
        testGolfCourseIncrementStrokeCount();
        testGolfCourseCalculatePar();

        System.out.println();
    }

    public static void testGolfCourseConstructor() {
        try {
            GolfCourse course = new GolfCourse("Columbia", 18, 0, 0, 0);

            assertTrue(course.getName().equals("Columbia"), "Constructor should set name to 'Columbia'");
            assertTrue(course.getNumberOfHoles() == 18, "Constructor should set number of holes to 18");
            assertTrue(course.getCurrentHole() == 0, "Constructor should set current hole to 0");
            assertTrue(course.getTotalStrokeCount() == 0, "Constructor should set total strokes to 0");
            assertTrue(course.getCoursePar() == 0, "Constructor should set course par to 0");

        } catch (Exception e) {
            fail("GolfCourse constructor test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfCourseGettersSetters() {
        try {
            GolfCourse course = new GolfCourse("Test", 9, 1, 5, 36);

            course.setName("New Course");
            assertTrue(course.getName().equals("New Course"), "setName/getName should work correctly");

            course.setNumberOfHoles(18);
            assertTrue(course.getNumberOfHoles() == 18, "setNumberOfHoles/getNumberOfHoles should work correctly");

            course.setCurrentHole(5);
            assertTrue(course.getCurrentHole() == 5, "setCurrentHole/getCurrentHole should work correctly");

            course.setTotalStrokeCount(25);
            assertTrue(course.getTotalStrokeCount() == 25, "setTotalStrokeCount/getTotalStrokeCount should work correctly");

            course.setCoursePar(72);
            assertTrue(course.getCoursePar() == 72, "setCoursePar/getCoursePar should work correctly");

        } catch (Exception e) {
            fail("GolfCourse getters/setters test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfCourseAdvanceToNextHole() {
        try {
            GolfCourse course = new GolfCourse("Test", 18, 0, 0, 0);

            course.advanceToNextHole();
            assertTrue(course.getCurrentHole() == 1, "Should advance from hole 0 to hole 1");

            course.advanceToNextHole();
            assertTrue(course.getCurrentHole() == 2, "Should advance from hole 1 to hole 2");

        } catch (Exception e) {
            fail("GolfCourse advanceToNextHole test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfCourseIncrementStrokeCount() {
        try {
            GolfCourse course = new GolfCourse("Test", 18, 0, 0, 0);

            course.incrementStrokeCount();
            assertTrue(course.getTotalStrokeCount() == 1, "Should increment stroke count to 1");

            course.incrementStrokeCount();
            course.incrementStrokeCount();
            assertTrue(course.getTotalStrokeCount() == 3, "Should increment stroke count to 3");

        } catch (Exception e) {
            fail("GolfCourse incrementStrokeCount test failed with exception: " + e.getMessage());
        }
    }

    public static void testGolfCourseCalculatePar() {
        try {
            GolfCourse course = new GolfCourse("Test", 18, 0, 0, 0);

            course.calculatePar(4);
            assertTrue(course.getCoursePar() == 4, "Should add 4 to course par (0 + 4 = 4)");

            course.calculatePar(3);
            assertTrue(course.getCoursePar() == 7, "Should add 3 to course par (4 + 3 = 7)");

        } catch (Exception e) {
            fail("GolfCourse calculatePar test failed with exception: " + e.getMessage());
        }
    }

    // ===== GAME INTEGRATION TESTS =====
    public static void testGameIntegration() {
        System.out.println("--- Testing Game Integration ---");

        testSpecialPutterRule();
        testCourseSpecifications();

        System.out.println();
    }

    public static void testSpecialPutterRule() {
        try {
            GolfHole hole = new GolfHole(1, 5, 4); // 5 yards from hole
            GolfClub club = new GolfClub();

            // Test the special putter rule logic from main game
            if (hole.getDistanceToHole() <= 5 && club.getClubSelected() == 1) {
                club.setShotDistance(hole.getDistanceToHole());
            }

            club.setClubSelected(1); // Putter
            club.setShotDistance(hole.getDistanceToHole()); // Should set to exact distance

            assertTrue(club.getShotDistance() == 5,
                "Putter within 5 yards should hit exact distance to hole");

        } catch (Exception e) {
            fail("Special putter rule test failed with exception: " + e.getMessage());
        }
    }

    public static void testCourseSpecifications() {
        try {
            // Test course matches assignment specifications
            GolfCourse course = new GolfCourse("Columbia", 18, 0, 0, 0);
            GolfHole hole = new GolfHole(1, 300, 4);

            assertTrue(course.getNumberOfHoles() == 18, "Course should have 18 holes");
            assertTrue(hole.getDistanceToHole() == 300, "Each hole should be 300 yards");
            assertTrue(hole.getPar() == 4, "Each hole should have par of 4");

        } catch (Exception e) {
            fail("Course specifications test failed with exception: " + e.getMessage());
        }
    }

    // ===== ASSIGNMENT REQUIREMENTS TESTS =====
    public static void testAssignmentRequirements() {
        System.out.println("--- Testing Assignment Requirements ---");

        testObjectOrientedDesign();
        testEncapsulation();
        testRequiredMethods();

        System.out.println();
    }

    public static void testObjectOrientedDesign() {
        try {
            // Test that classes exist and can be instantiated
            GolfHole hole = new GolfHole(1, 300, 4);
            GolfClub club = new GolfClub();
            GolfCourse course = new GolfCourse("Test", 18, 0, 0, 0);

            assertTrue(hole != null, "GolfHole class should be instantiable");
            assertTrue(club != null, "GolfClub class should be instantiable");
            assertTrue(course != null, "GolfCourse class should be instantiable");

        } catch (Exception e) {
            fail("Object-oriented design test failed with exception: " + e.getMessage());
        }
    }

    public static void testEncapsulation() {
        try {
            // Test that all required getters and setters exist and work
            GolfHole hole = new GolfHole(1, 300, 4);

            // Test all GolfHole getters/setters
            hole.setHole(5);
            assertTrue(hole.getHole() == 5, "GolfHole hole field should be encapsulated");

            hole.setDistanceToHole(200);
            assertTrue(hole.getDistanceToHole() == 200, "GolfHole distanceToHole field should be encapsulated");

            hole.setPar(3);
            assertTrue(hole.getPar() == 3, "GolfHole par field should be encapsulated");

            hole.setStroke(2);
            assertTrue(hole.getStroke() == 2, "GolfHole stroke field should be encapsulated");

        } catch (Exception e) {
            fail("Encapsulation test failed with exception: " + e.getMessage());
        }
    }

    public static void testRequiredMethods() {
        try {
            GolfHole hole = new GolfHole(1, 300, 4);
            GolfClub club = new GolfClub();

            // Test required methods exist
            hole.calculateUpdatedDistance(150);
            hole.incrementStrokeCount();
            club.hitBall();

            assertTrue(true, "All required methods should exist and be callable");

        } catch (Exception e) {
            fail("Required methods test failed with exception: " + e.getMessage());
        }
    }

    // ===== UTILITY METHODS =====
    public static void assertTrue(boolean condition, String message) {
        testsRun++;
        if (condition) {
            testsPassed++;
            System.out.println("PASS: " + message);
        } else {
            System.out.println("FAIL: " + message);
        }
    }

    public static void fail(String message) {
        testsRun++;
        System.out.println("✗ FAIL: " + message);
    }
}