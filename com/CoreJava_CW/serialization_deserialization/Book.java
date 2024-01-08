package com.CoreJava_CW.serialization_deserialization;

import java.io.Serializable;

public class Book implements Serializable {
    private int b_id;
    private String b_name;
    private String b_author;

    public Book()
    {

    }

    public Book(int b_id,String b_name,String b_author)
    {
        this.b_id = b_id;
        this.b_name = b_name;
        this.b_author = b_author;
    }

    public void setB_id(int b_id)
    {
        this.b_id = b_id;
    }
    public int getB_id()
    {
        return this.b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_author='" + b_author + '\'' +
                '}';
    }
}
