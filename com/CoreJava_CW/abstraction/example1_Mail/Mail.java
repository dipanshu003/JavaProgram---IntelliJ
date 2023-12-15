package com.CoreJava_CW.abstraction.example1_Mail;

public abstract class Mail {
    String sendMail;
    String subject;
    String body;

    Mail(String sendMail,String subject,String body)
    {
        this.sendMail = sendMail;
        this.subject = subject;
        this.body = body;
    }

    public abstract boolean autheticationOfMail();
    public abstract void connecting();
    public abstract void sendMial1();
    public abstract void disconnecting();

}
