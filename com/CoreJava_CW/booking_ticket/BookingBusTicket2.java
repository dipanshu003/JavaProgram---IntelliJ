package com.CoreJava_CW.booking_ticket;

import java.util.Scanner;

public class BookingBusTicket2 {
    private String start,destination,name;
    private int seats_no;
    private static int totalSeats=100;

    BookingBusTicket2()
    {
        acceptTicket();
        System.out.println();
        displayInfo();
    }
    BookingBusTicket2(String name,String start,String destination,int seats_no)
    {

    }

    public void displayInfo()
    {
        System.out.println("Your name is "+ this.getName());
        System.out.println("Your Starting Point is : "+this.getStart());
        System.out.println("Your Destination Point is : "+this.getDestination());
        System.out.println("You Booked Seats : "+this.getSeats_no());
        System.out.println("Available Seats : "+(totalSeats-seats_no));
    }
    public void acceptTicket()
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        this.setName(x.nextLine());

        System.out.print("Enter Your Starting Point : ");
        this.setStart(x.nextLine());

        System.out.print("Enter Your Destination Point : ");
        this.setDestination(x.nextLine());

        System.out.print("Enter Number of Seats you want to Book : ");
        this.setSeats_no(x.nextInt());
    }
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats_no() {
        return seats_no;
    }

    public void setSeats_no(int seats_no) {
        this.seats_no = seats_no;
    }

    public static int getTotalSeats() {
        return totalSeats;
    }

    public static void setTotalSeats(int totalSeats) {
        BookingBusTicket2.totalSeats = totalSeats;
    }
}
