
import java.util.*;

public class App {

    public static Integer getBaggageLimit(final String PNR) {
        if (PNR.contains("ECO")) {
            return 20;
        } else if (PNR.contains("BUS")) {
            return 35;
        } else if (PNR.contains("FIR")) {
            return 40;
        }
        return null;
    }

    public static Integer genBill(Integer Baggage, Integer Limit) {
        if (Baggage <= Limit) {
            return 0;
        } else if (Baggage >= Limit) {
            return (Baggage - Limit);
        } else {
            return null;
        }
    }

    public static void main(final String[] args) {

        final Type1 Eticket = new Type1(60);
        final Type2 Bticket = new Type2(60);
        final Type3 Fticket = new Type3(60);
        final Scanner sc = new Scanner(System.in);

        while (true) {
            int billPrice = 0;
            System.out.println("::: MENU :::");

            System.out.println("01: Book Ticket");
            System.out.println("02: PNR status");
            System.out.println("03: Cancel booked Ticket");
            System.out.println("04: Get Baggage Limit using PNR");
            System.out.println("05: Exit");
            System.out.print("Enter Choice :: ");

            final int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1: {
                        System.out.println("------We have : ");
                        System.out.println("------01 : Economy class (Base Fare : Rs.5,000)");
                        System.out.println("------02 : Business class (Base Fare : Rs.7,000)");
                        System.out.println("------03 : First Class (Base Fare : Rs.10,000)");
                        System.out.print("--------------Enter type of flight : ");

                        final int classChoice = sc.nextInt();
                        try {
                            switch (classChoice) {
                                case 1: {
                                    billPrice = 5000;

                                    System.out.println("Enter Baggage (in Kgs): ");
                                    final int Bag = sc.nextInt();
                                    if (Bag > 20) {
                                        System.out.println("Baggage more than 20 Kgs not Allowed");
                                    } else {
                                        billPrice += genBill(Bag, 15) * 2000;
                                    }

                                    if (Eticket.BookTicketE()) {
                                    } else if (Bticket.BookTicketE()) {
                                    } else if (Fticket.BookTicketE()) {
                                    } else
                                        System.out.println("No seats Available");

                                    System.out.println("Ticket booked Succesfully !! BILL = Rs." + billPrice);
                                    break;
                                }

                                case 2: {
                                    billPrice = 7000;

                                    System.out.println("Enter Baggage (in Kgs): ");
                                    final int Bag = sc.nextInt();
                                    if (Bag > 35) {
                                        System.out.println("Baggage more than 35 Kgs not Allowed");
                                    } else {
                                        billPrice += genBill(Bag, 25) * 3000;
                                    }

                                    if (Bticket.BookTicketB()) {
                                    } else if (Fticket.BookTicketB()) {
                                    } else
                                        System.out.println("No seats Available");

                                    System.out.println("Ticket booked Succesfully !! BILL = Rs." + billPrice);

                                    break;
                                }
                                case 3: {
                                    billPrice = 10000;
                                    System.out.println("Enter Baggage (in Kgs): ");
                                    final int Bag = sc.nextInt();
                                    if (Bag > 40) {
                                        System.out.println("Baggage more than 40 Kgs not Allowed");
                                    } else {
                                        billPrice += genBill(Bag, 30) * 4000;
                                    }

                                    if (Fticket.BookTicketF()) {
                                    } else
                                        System.out.println("No seats Available");
                                    System.out.println("Ticket booked Succesfully !! BILL = Rs." + billPrice);

                                    break;
                                }
                                default: {
                                    throw new Exception("Invalid input !!!");
                                }

                            }
                        } catch (final Exception e) {
                            System.out.println("Invalid Input !! Error :" + e);
                        }
                        break;
                    }
                    case 2: {

                        try {
                            String PNRent;

                            System.out.println("Enter PNR :");

                            PNRent = sc.next();

                            System.out.println("Status of your ticket :: ");

                            if (PNRent.contains("FLA1")) {
                                if (Eticket.checkStatus(PNRent)) {
                                    System.out.print("confirmed");
                                }
                            } else if (PNRent.contains("FLA2")) {
                                if (Bticket.checkStatus(PNRent)) {
                                    System.out.print("ticket is confirmed");
                                }

                            } else if (PNRent.contains("FLA3")) {
                                if (Fticket.checkStatus(PNRent)) {
                                    System.out.print("Ticket is confirmed");
                                } else {
                                    System.out.print("PNR Not found");
                                }

                            } else {
                                throw new Exception("Invalid Input !!!");
                            }

                        } catch (final Exception e) {
                            System.out.println("Invalid input !!" + e);
                        }
                        break;
                    }
                    case 3: {

                        System.out.println("Enter PNR : ");

                        final String PNRent = sc.next();
                        try {
                            if (PNRent.contains("FLA1")) {
                                if (Eticket.cancelTicket(PNRent)) {
                                    System.out.println("Your ticket has been cancelled");
                                }
                                ;
                            } else if (PNRent.contains("FLA2")) {
                                if (Bticket.cancelTicket(PNRent)) {
                                    System.out.println("Your ticket has been cancelled");
                                }
                                ;
                            } else if (PNRent.contains("FLA3")) {
                                if (Fticket.cancelTicket(PNRent)) {
                                    System.out.println("Your ticket has been cancelled");
                                }
                                ;
                            } else {
                                throw new Exception("Invalid Input");
                            }

                        } catch (final Exception e) {
                            System.out.println("Invalid Input");
                        }
                        break;
                    }
                    case 4: {
                        System.out.println("Enter PNR : ");

                        final String PNR = sc.next();
                        System.out.println("Max Baggage Limit :" + getBaggageLimit(PNR));

                        break;
                    }
                    case 5: {
                        break;
                    }
                    default: {
                        throw new Exception("Invalid input !!");
                    }
                }

            } catch (final Exception e) {
                System.out.println(e);
            }
        }
    }

}