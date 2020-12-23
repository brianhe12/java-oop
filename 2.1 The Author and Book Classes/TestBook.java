
public class TestBook {
    public static void main(String[] args){
        Author George = new Author("GeorgeRRMartin", "GRM@GOT.com", 'M'); // Test the constructor

        Book Book1 = new Book("Fire",George,10);
        Book Book2 = new Book("Water",George,20,4);

        System.out.println(Book1);
        System.out.println(Book2);

        System.out.println(Book1.getName());
        System.out.println(Book1.getAuthor());
        System.out.println(Book1.getPrice());
        System.out.println(Book1.getQty());
        
        // Change price
        Book1.setPrice(1337);
        System.out.println(Book1.getPrice());

        // Change qty
        Book1.setQty(9999);
        System.out.println(Book1.getQty());


    }
}
