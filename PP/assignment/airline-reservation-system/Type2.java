
public class Type2 extends Flight {
    int totalSeats = 60;

    public Type2(Integer totalSeats) {
        // call the parent constructor
        super(totalSeats);
    }

    public boolean BookTicketE() {

        final int EseatCount = 40;

        if (PNRbook.size() != EseatCount) {

            final String GenPNR = "ECOFLA2" + (char) (PNRbook.size() + 65);
            this.PNRbook.add(PNRbook.size(), GenPNR);
            System.out.println("Ticket Succesfully Booked. PNR : " + GenPNR);
            return true;
        } else {
            return false;
        }

    };

    public boolean BookTicketB() {
        final int BseatCount = 10;

        if (PNRbook.size() != BseatCount) {

            final String GenPNR = "BUSFLA2" + (char) (PNRbook.size() + 65);
            this.PNRbook.add(PNRbook.size(), GenPNR);
            System.out.println("Ticket Succesfully Booked. PNR : " + GenPNR);
            return true;
        } else {
            return false;
        }

    }
}