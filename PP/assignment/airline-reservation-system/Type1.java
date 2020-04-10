
public class Type1 extends Flight {

    int totalSeats = 60;

    public Type1(Integer totalSeats) {
        // call the parent constructor
        super(totalSeats);
    }

    public boolean BookTicketE() {

        final int EseatCount = 60;

        if (PNRbook.size() != EseatCount) {

            final String GenPNR = "ECOFLA1" + (char) (PNRbook.size() + 65);
            this.PNRbook.add(PNRbook.size(), GenPNR);
            System.out.println("Ticket Succesfully Booked. PNR :" + GenPNR);
            return true;
        } else {
            return false;
        }

    }

}