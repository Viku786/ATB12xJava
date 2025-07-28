package Task.Task_9thJune;

public class Qno_4 {
    public static void main(String[] args) {

        /*
4) Book Class with Constructor
Write a Book class that takes title, author, and price via constructor.
 Display all values.
         */
        Book b1 = new Book("Vikash Singh", "Life Struggle",200);
        b1.bookDetails();
    }
}

class Book{
    String Author, Title;
    int Price;

    Book(String Author, String Title, int Price){
        this.Author=Author;
        this.Title=Title;
        this.Price=Price;
    }

    void bookDetails(){
        System.out.println("Author Name : "+Author);
        System.out.println("Title of the Book : "+Title);
        System.out.println("Price of the Book : "+Price);
    }
}
