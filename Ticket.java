abstract public class Ticket {
    private int ticketNumber;
    public double price = 50.00;
    
    //constructor
    public Ticket(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    //return ticket's price
    public double getPrice() {
        return this.price;
    }

    public String toString() {
        String ticketInformation = String.format("Number: %s, price: %s", ticketNumber, this.getPrice());
        return ticketInformation;
    }
}