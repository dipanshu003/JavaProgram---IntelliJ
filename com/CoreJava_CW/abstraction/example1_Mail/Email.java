package com.CoreJava_CW.abstraction.example1_Mail;

public class Email extends Mail {
    Email(String sendMail,String subject, String body)
    {
        super(sendMail,subject,body);
    }

    @Override
    public boolean autheticationOfMail() {
        if (sendMail!= null)
        {
            System.out.println("Senting Mail...");
            return true;
        }
        return false;
    }

    @Override
    public void sendMial1() {
        connecting();
        if (autheticationOfMail())
        {
            System.out.println(subject);
            System.out.println(body);
            disconnecting();
        }
    }

    @Override
    public void connecting() {
        System.out.println("Bharat Mata ki Jai...Connect Ho gya...");
    }

    @Override
    public void disconnecting() {
        System.out.println("Vande Mataram.... disconnecting ho gya");
    }

    public static void main(String[] args) {

        Email e = new Email("skjdjfkl","MAth","Jan gan Man");
        e.sendMial1();
        e.autheticationOfMail();

    }

}
