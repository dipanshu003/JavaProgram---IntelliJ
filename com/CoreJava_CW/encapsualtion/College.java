package com.CoreJava_CW.encapsualtion;

public class College {
    private String cName;
    private int noOfDep;
    private int noOfStu;
    private boolean isGov;


    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getNoOfDep() {
        return noOfDep;
    }

    public void setNoOfDep(int noOfDep) {
        this.noOfDep = noOfDep;
    }

    public int getNoOfStu() {
        return noOfStu;
    }

    public void setNoOfStu(int noOfStu) {
        this.noOfStu = noOfStu;
    }

    public boolean isGov() {
        return isGov;
    }

    public void setGov(boolean gov) {
        isGov = gov;
    }

    public static void main(String[] args) {

        College c = new College();
        c.setcName("JBK");
        c.setGov(true);
        c.setNoOfDep(5);
        c.setNoOfStu(500);
        System.out.println(c.getcName()+" "+ c.getNoOfDep()+" "+c.getNoOfStu()+" "+c.isGov());

    }
}
