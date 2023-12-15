package com.CoreJava_CW.booking_ticket;

import java.util.Scanner;

public class BookingBusTicket {

    static int totalSeat = 100;
    String name;
    String starting_point;
    String destination;

    public void bookingTicket() {
        Scanner scanner = new Scanner(System.in);

        while (totalSeat>=0)
        {
            System.out.print("Enter Seats you want to book : ");
            int bookingSeats = scanner.nextInt();

            if (totalSeat >= bookingSeats) {
                totalSeat =totalSeat - bookingSeats;
                System.out.println("Total Seats Available now : " + totalSeat);
                System.out.println();
            } else if (bookingSeats==999) {
                break;
            } else {
                System.out.println("Not enough seats available. Please enter a valid number.");
                System.out.println();
            }

        }
    }

    public static void main(String[] args) {
        BookingBusTicket busTicket = new BookingBusTicket();
        busTicket.bookingTicket();
    }
}
