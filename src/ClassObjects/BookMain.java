package ClassObjects;

public class BookMain {
    public static void main(String[] args){
        Book b = new Book();
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        b.printBookDetails("My Book", "Navjot", 2024);
        b1.printBookDetails("My Book 2", "Navjot", 2024);
        b2.printBookDetails("My Book 3", "Navjot", 2024);
        b3.printBookDetails("My Book 4", "Navjot", 2024);
    }
}
// no default costructor in the case of parameterized constructor

// leap memory, heap memory, local variable , global variable, static, instance variable?