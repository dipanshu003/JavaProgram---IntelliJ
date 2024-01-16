package com.CoreJava_CW.thread.Synchronization_of_thread;

public class BookTicket {
    public static int totalSeat = 10;

     synchronized public void bookedTicket(int bookingSeat)

    {
        if (totalSeat>=bookingSeat)
        {
            System.out.println("Your Seats Booked Successfully...");
            totalSeat-=bookingSeat;
            System.out.println("Remaining Available seats "+totalSeat);
        }
        else {
            System.out.println("Available seats : "+totalSeat+" only");
        }
    }
}
