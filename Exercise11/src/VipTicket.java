public class VipTicket extends Ticket{

    private double additionalValue;
    public VipTicket(double value, double additionalValue) {
        super(value);
        this.additionalValue = additionalValue;

    }

    public double getVipTicketValue() {
        return this.additionalValue + this.value;
    }



}
