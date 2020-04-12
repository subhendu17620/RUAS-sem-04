import java.util.*;

public class Flight {

    List<String> PNRbook;

    public Flight(final Integer totalseats) {
        this.PNRbook = new ArrayList<String>(totalseats);
    }

    public boolean checkStatus(final String PNR) {
        if (!PNRbook.contains(PNR)) {
            System.out.println("PNR not found !!");
            return false;
        }

        if (PNR.contains("ECO")) {
            System.out.println("---CLASS: ECONOMY");
        } else if (PNR.contains("BUS")) {
            System.out.println("---CLASS: BUISNESS");

        } else if (PNR.contains("FIR")) {
            System.out.println("---CLASS: FIRST CLASS");

        }

        if (PNR.contains("1")) {
            System.out.println("---FLIGHT: TYPE 1");
        } else if (PNR.contains("2")) {
            System.out.println("---FLIGHT: TYPE 2");

        } else if (PNR.contains("3")) {
            System.out.println("---FLIGHT: TYPE 3");

        }

        final Integer idx = this.PNRbook.indexOf(PNR) + 1;

        System.out.println("---SEAT " + idx);

        return true;
    }

    public boolean cancelTicket(final String PNR) {

        this.PNRbook.set(PNRbook.indexOf(PNR), null);
        return true;
    }

}
