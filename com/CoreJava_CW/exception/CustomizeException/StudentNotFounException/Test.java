package com.CoreJava_CW.exception.CustomizeException.StudentNotFounException;

public class Test {
    public static void main(String[] args) throws StudentNotFoundException {
        String s_name = "Dip";

        try
        {

            if (s_name .equals("Piyu") )
            {
                System.out.println("Correct Student...");
            }
            else {
                throw  new StudentNotFoundException("Student not Found....");
            }
        }

        catch (StudentNotFoundException s)
        {
            System.err.println(s.getMessage());
        }


        System.out.println("Done..");
    }
}
