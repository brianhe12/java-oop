
public class Book {
    private String name;
    private Author[] authors = new Author[2]; // initalize to size 2 array
    private double price;
    private int qty = 0; // initialize to 0

    /** Constructor */
    public Book(String name, Author[] authors, double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    /** Second constructor */
    public Book(String name, Author[] authors, double price, int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    /** Getters and Setters*/
    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    } 

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    public String getAuthorNames(){
        return authors[0].getName()+','+authors[1].getName();
    }

    public String toString(){
        return "[Book[name="+name+",Author[name={"+authors[0]+','+authors[1]+"},price="+price+",qty="+qty+"]";
    }
}
