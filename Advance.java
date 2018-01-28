
//This class creates AdvanceTicket object definitions. It extends RegularTicket.
public class AdvanceTicket extends Ticket {
    private int daysInAdvance;
    private static int earliestBird = 30;
    private static int earlyBird = 40;
    // constructor 
    public AdvanceTicket(double price, int daysInAdvance) {
        if (daysInAdvance >= 10) {
            super.price = earliestBird;
        }
        else if (daysInAdvance > 9) {
            super.price = earlyBird;
        }
    }
}
