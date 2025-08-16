package Other;
public class ProcessArray {
    public static void main(String[] args) {
        int[] parkingTickets = new int[365];


        int k;
        int mostTickets = parkingTickets[0];
        for (k = 1; k < parkingTickets.length; k++) {
            if (parkingTickets[k] > mostTickets)
                mostTickets = parkingTickets[k];
        }
    }
}
