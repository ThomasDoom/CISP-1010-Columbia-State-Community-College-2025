public class RunningForLoop {
    public static void main(String[] args) {
        int n = 5; //positive value
        int crystalEnergy;
        int totalEnergy = 0;

        for (crystalEnergy = 1; crystalEnergy <= n; crystalEnergy++) {
            totalEnergy += Math.pow(crystalEnergy, 2);
        }

        System.out.println(totalEnergy);
    }
}
