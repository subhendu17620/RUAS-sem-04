
public class Type3 extends Flight {
    int totalSeats = 60;

    public Type3(Integer totalSeats) {
        // call the parent constructor
        super(totalSeats);
    }

    public boolean BookTicketF() {
        final int FseatCount = 10;

        if (PNRbook.size() != FseatCount) {

            final String GenPNR = "FIRFLA3" + (char) (PNRbook.size() + 65);
            this.PNRbook.add(PNRbook.size(), GenPNR);
            System.out.println("Ticket Succesfully Booked. PNR : " + GenPNR);
            return true;
        } else {
            return false;
        }

    }

    public boolean BookTicketE() {
        final int EseatCount = 40;

        if (PNRbook.size() != EseatCount) {

            final String GenPNR = "ECOFLA3" + (char) (PNRbook.size() + 65);
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

            final String GenPNR = "BUSFLA3" + (char) (PNRbook.size() + 65);
            this.PNRbook.add(PNRbook.size(), GenPNR);
            System.out.println("Ticket Succesfully Booked. PNR : =" + GenPNR);
            return true;
        } else {
            return false;
        }

    }

}