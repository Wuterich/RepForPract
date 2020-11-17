public class Book {
    private String author;
    private String name;
    private float price;
    private int outyear;

    public Book(){
        author = "Undefined";
        name = "Undefined";
        price = 0.0f;
        outyear = 0;
    }

    public Book(String author, String name, float price, int outyear){
        this.author = author;
        this.name = name;
        this.price = price;
        this.outyear = outyear;
    }

    public Book(String author, int outyear){
        this();
        this.author = author;
        this.outyear = outyear;
    }

    public void show(){
        System.out.println(author);
        System.out.println(name);
        System.out.println(price);
        System.out.println(outyear);
    }

}
