package com.CoreJava_CW.interface_stuff.Mail;

public class Email implements Mail{
    String sendMail,subject,body;

    Email(String sendMail,String subject,String body)
    {
        this.sendMail = sendMail;
        this.subject = subject;
        this.body = body;
    }

    /*- Create Email class
	   - take variable sendmail , subject , body
	   - create parameterized consrtuctor
    - take method authenticationofmail() with boolean return type
            -> if sendmail is not equal to null then return true else return false
    - take method connecting()
            -> pass some message
    - take method sendmail()
            -> call connecting method in this method
            -> if authenticationofmail() then print subject and body of mail
            -> call disconnecting method in this method
    - take method disconnecting
            -> pass some message*/

    @Override
    public boolean authenticationofmail() {
        if (sendMail!=null)
        {
            return true;
        }
        return false;
    }

    @Override
    public void connecting() {
        System.out.println("Connecting Method is Calling...");
    }

    @Override
    public void sendMail() {
        connecting();
        if (authenticationofmail())
        {
            System.out.println("Send Mail -> "+sendMail);
            System.out.println("Subject -> "+subject);
            System.out.println("Body ->"+body);
        }
        disconnecting();
    }

    @Override
    public void disconnecting() {
        System.out.println("Disconnecting Method is Calling...");
    }
}
