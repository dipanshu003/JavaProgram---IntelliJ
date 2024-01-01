package com.CoreJava_CW.string_builder;

public class StringBuilder {
    public static void main(String[] args) {

        System.out.println("Program Started...");

        String s = new String("Dipanshu Dhole");
//        System.out.println("String object - > "+s);
//        String string=s.replace("Dhole","Raju");
//        System.out.println(string);

        java.lang.StringBuilder sb = new java.lang.StringBuilder("Minal");
        System.out.println(sb);
        sb.append(" Nirgude");
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb);
//        try{
//            sb.deleteCharAt(100);
//        }
//        catch (StringIndexOutOfBoundsException e)
//        {
//            System.out.println("StringIndexOutOfBoundsException at line 21...");
//        }

        System.out.println(sb.indexOf(" N"));
//        System.out.println(sb.lastIndexOf());

        System.out.println("Program ended...");

    }
}
