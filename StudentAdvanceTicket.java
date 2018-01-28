public class StudentAdvanceTicket extends AdvanceTicket {
    // constructor 
    public double StudentAdvanceTicket(double price, int daysInAdvance) {
        super(int ticketNumber, double daysInAdvance)
        this.price = super.price / 2;
    }

    public String toString(){
		return super.toString() + "ID required.\n";
	}//end of method toString
}