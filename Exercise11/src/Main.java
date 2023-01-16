public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket(10);
        VipTicket vipTicket = new VipTicket(10, 10);

        System.out.println("The VIP ticket cost is R$ " + vipTicket.getVipTicketValue());

    }
}