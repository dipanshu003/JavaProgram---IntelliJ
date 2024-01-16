package com.CoreJava_CW.thread.Synchronization_of_thread;

public class MovieBookingApp extends Thread{

    int seat;

    static BookTicket b;
    @Override
    public void run() {
        b.bookedTicket(seat);
    }

    public static void main(String[] args) {
        b= new BookTicket();
        MovieBookingApp t1 = new MovieBookingApp();
        t1.seat = 7;
        t1.start();

        MovieBookingApp t2 = new MovieBookingApp();
        t2.seat = 8;
        t2.start();

    }
}
