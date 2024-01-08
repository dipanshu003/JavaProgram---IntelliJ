package practice.Interview_Practice.pr1.sorting_list;

public class Book {
    private int b_id;
    private String b_name;

    private float b_price;

    public Book()
    {

    }
    public Book (int b_id,String b_name,int b_price)
    {
        this.b_id = b_id;
        this.b_name = b_name;
        this.b_price = b_price;
    }

    public int getB_id() {
        return b_id;
    }

    public void setB_id(int b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public float getB_price() {
        return b_price;
    }

    public void setB_price(float b_price) {
        this.b_price = b_price;
    }

    //toString

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_price=" + b_price +
                '}';
    }
}
